/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import myproperty.v1._dao.interfaces.UserRoleDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1.db.JpaController;
import myproperty.v1.db._entities.User;
import myproperty.v1.db._entities.UserRole;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author mover 8/5/2017
 */
public class UserRoleDaoImpl extends JpaController implements UserRoleDao {
    private static final Logger LOG = Logger.getLogger(UserRoleDaoImpl.class.getName());
    private static UserRoleDaoImpl instance = null;

    public static UserRoleDaoImpl getInstance() {
        if (instance == null) {
            instance = new UserRoleDaoImpl();
        }
        return instance;
    }

    public UserRoleDaoImpl() {
        super(UserRole.class);
    }

    @Override
    public UserRole create(UserRole userRole) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(userRole);
            em.getTransaction().commit();
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "Record not Saved");
            throw new InternalErrorException("Record not Saved", ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return userRole;
    }

    @Override
    public UserRole edit(UserRole userRole) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            userRole = em.merge(userRole);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = userRole.getId();

                if (findUserRole(id) == null) {
                    throw new Exception("The UserRole  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return userRole;

    }

    @Override
    public UserRole findUserRole(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UserRole.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<UserRole> findUserRoleEntities() {
        return findUserRoleEntities(true, -1, -1);
    }

    @Override
    public List<UserRole> findUserRoleEntities(int maxResults, int firstResult) {
        return findUserRoleEntities(false, maxResults, firstResult);
    }

    private List<UserRole> findUserRoleEntities(boolean all, int maxResults, int firstResult) {
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
            UserRole userRole;
            try {
                userRole = em.getReference(UserRole.class, id);
                userRole.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The UserRole  with id " + id + " no longer exists.", enfe);
            }
            em.remove(userRole);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }



}
