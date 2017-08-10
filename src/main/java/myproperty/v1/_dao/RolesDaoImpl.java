package myproperty.v1._dao;


import myproperty.v1._dao.interfaces.RolesDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1.db.JpaController;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db._entities.Roles;
import myproperty.v1.helper.exception.InternalErrorException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mover 8/1/2017
 */
public class RolesDaoImpl extends JpaController implements RolesDao {

    private static final Logger LOG = Logger.getLogger(RolesDaoImpl.class.getName());
    private static RolesDaoImpl instance = null;

    public static RolesDaoImpl getInstance() {
        if (instance == null) {
            instance = new RolesDaoImpl();
        }
        return instance;
    }

    public RolesDaoImpl() {
        super(Roles.class);
    }

    @Override
    public Roles create(Roles roles) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(roles);
            em.getTransaction().commit();
            LOG.log(Level.WARNING, "Record   Saved Succesfully");
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "Record not Saved");
            throw new InternalErrorException("Record not Saved", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return roles;
    }

    @Override
    public Roles edit(Roles roles) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            roles = em.merge(roles);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = roles.getId();

                if (findRole(id) == null) {
                    throw new Exception("The  Role  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return roles;
    }

    @Override
    public Roles findRole(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(Roles.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Roles> findRolesrEntities() throws Exception {
        return findARolesEntities(true, -1, -1);
    }

    @Override
    public List<Roles> findARolesEntities(int maxResults, int firstResult) throws Exception {
        return findARolesEntities(false, maxResults, firstResult);
    }

    private List<Roles> findARolesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Roles.class));
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
    public void deleteRoles(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Accounts accounts;
            try {
                accounts = em.getReference(Accounts.class, id);
                accounts.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The Roles  with id " + id + " no longer exists.", enfe);
            }
            em.remove(accounts);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public Roles findRoleByName(String name) throws Exception {
        Roles _roles = null;
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Roles.findByName");
            query.setParameter("name", name);
            List<Roles> roles = query.getResultList();
            if (roles.size() > 0) {
                _roles = roles.get(0);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }

        return _roles;
    }


}
