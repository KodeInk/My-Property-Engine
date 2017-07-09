/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1.db.JpaController;
import myproperty.v1.db._entities.Property;
import myproperty.v1.db._entities.PropertySize;
import myproperty.v1.db._entities.User;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author Mover
 */
public class PropertySizeDaoImpl extends JpaController {

    private static final Logger LOG = Logger.getLogger(PropertySizeDaoImpl.class.getName());

    private static PropertySizeDaoImpl instance = null;

    public static PropertySizeDaoImpl getInstance() {
        if (instance == null) {
            instance = new PropertySizeDaoImpl();
        }
        return instance;
    }

    public PropertySizeDaoImpl() {
        super(PropertySize.class);
    }

    public PropertySize create(PropertySize propertySize) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(propertySize);
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
        return propertySize;
    }

    public PropertySize edit(PropertySize propertySize) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            propertySize = em.merge(propertySize);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = propertySize.getId();

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
        return propertySize;
    }

    public PropertySize findProperty(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PropertySize.class, id);
        } finally {
            em.close();
        }
    }

    public List<Property> findPropertySizeEntities() {
        return findPropertySizeEntities(true, -1, -1);
    }

    public List<Property> findPropertySizeEntities(int maxResults, int firstResult) {
        return findPropertySizeEntities(false, maxResults, firstResult);
    }

    private List<Property> findPropertySizeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PropertySize.class));
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

    public void destroy(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PropertySize propertySize;
            try {
                propertySize = em.getReference(PropertySize.class, id);
                propertySize.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The Property Size  with id " + id + " no longer exists.", enfe);
            }
            em.remove(propertySize);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //TODO: Get Property Size  By Property Id 
    public List<Property> findPropertySizeEntitiesByPropertyId(Integer propertyId, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("PropertySize.findByPropertyId");
            query.setParameter("propertyId", propertyId);
            return query.getResultList();
        } finally {
            em.close();
        }
    }




}
