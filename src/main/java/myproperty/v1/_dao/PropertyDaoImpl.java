/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import myproperty.v1._dao.interfaces.PropertyDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1.db._entities.Property;
import myproperty.v1.db.JpaController;

/**
 *
 * @author Mover 6/24/2017
 */
public class PropertyDaoImpl extends JpaController implements PropertyDao {
    private static final Logger LOG = Logger.getLogger(PropertyDaoImpl.class.getName());

    private static PropertyDaoImpl instance = null;

    public static PropertyDaoImpl getInstance() {
        if (instance == null) {
            instance = new PropertyDaoImpl();
        }
        return instance;
    }


    public PropertyDaoImpl() {
        super(Property.class);
    }

    @Override
    public Property create(Property property) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(property);
            em.getTransaction().commit();
            LOG.log(Level.WARNING, "Record   Saved Succesfully");
        } catch (Exception ex) {
            LOG.log(Level.WARNING, "DB LEVEL ");
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return property;
    }

    @Override
    public Property edit(Property property) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            property = em.merge(property);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = property.getId();

                if (findProperty(id) == null) {
                    throw new Exception("The Property  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return property;
    }

    @Override
    public Property findProperty(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Property.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Property> findPropertyEntities() {
        return findPropertyEntities(true, -1, -1);
    }

    @Override
    public List<Property> findPropertyEntities(int maxResults, int firstResult) {
        return findPropertyEntities(false, maxResults, firstResult);
    }

    private List<Property> findPropertyEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Property.class));
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

    //TODO: Get Property By User ID 
    public List<Property> findPropertyEntitiesByUserId(Integer Userid, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Property.findByUser");
            query.setParameter("userId", Userid);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    //TODO: Get Property Entity By Account ID 
    public List<Property> findPropertyEntitiesByAccountId(Integer accountId, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("Property.findByAccount");
            query.setParameter("accountId", accountId);
            return query.getResultList();
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
            Property property;
            try {
                property = em.getReference(Property.class, id);
                property.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The Property  with id " + id + " no longer exists.", enfe);
            }
            em.remove(property);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }


}
