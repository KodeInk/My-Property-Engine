package myproperty.v1._dao;

import myproperty.v1._dao.interfaces.userDAO;
import myproperty.v1.db._entities.User;
import myproperty.v1.db.JpaController;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1.helper.enums.ContactTypes;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 * Created by mover on 5/6/2017.
 */


public class userDAOImpl extends JpaController implements userDAO {
    private static final Logger LOG = Logger.getLogger(userDAOImpl.class.getName());

    private static userDAOImpl instance = null;

    public static userDAOImpl getInstance() {
        if(instance == null){
            instance =  new userDAOImpl();
        }
        return instance;
    }


    public userDAOImpl() {
        super(User.class);
    }

    @Override
    public User create(User user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "Record not Saved");
            throw new InternalErrorException("Record not Saved", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return user;
    }

    @Override
    public User edit(User user) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            user = em.merge(user);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = user.getId();

                if (findUser(id) == null) {
                    throw new Exception("The User  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return user;

    }





    @Override
    public User findUser(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }
    }



    @Override
    public List<User> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    @Override
    public List<User> findUserEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<User> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }


    @Override
    public void destroy(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User user;
            try {
                user = em.getReference(User.class, id);
                user.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The User  with id " + id + " no longer exists.", enfe);
            }
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }


    @Override
    public User CheckPassword(User user) throws Exception {
        User user1 = null;
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("User.checkPassword");
            query.setParameter("userName", user.getUsername());
            query.setParameter("userPassword", user.getPassword());
            List<User> users = query.getResultList();
            if (users.size() > 0) {
                user1 = users.get(0);
            }
        } finally {
            em.close();
        }

        return user1;
    }

    public User loginUser(String username, String password) {
        User user = null;
        EntityManager em = getEntityManager();
        try {

            Query query = em.createNamedQuery("User.findUserByUsernameAndPassword");
            query.setParameter("username", username);
            query.setParameter("password", password);
            List<User> users = query.getResultList();
            if (users.size() > 0) {
                user = users.get(0);
            }

        } finally {
            em.close();
        }

        return user;

    }

    @Override
    public List<User> checkActiveUserByEmail(String email_address) throws Exception {
        EntityManager em = null;
        List<User> users = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            String query = "SELECT U.* FROM user  U \n"
                    + "JOIN person P \n"
                    + "ON P.userId = U.id\n"
                    + "JOIN contacts  C \n"
                    + "ON P.id = C.parent_id AND C.parent_type LIKE 'PERSON'\n"
                    + "WHERE C.type LIKE '" + ContactTypes.EMAIL + "' AND U.status NOT LIKE 'DEACTIVATED' AND C.details LIKE  '%" + email_address + "%'  ";
                    
            Query q = em.createNativeQuery(query, User.class);
            users = q.getResultList();

        } finally {
            em.close();
        }


        return users;
    }




}