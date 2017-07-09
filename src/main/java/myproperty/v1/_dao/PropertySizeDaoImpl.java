/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import myproperty.v1._dao.interfaces.PropertySizeDao;
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
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author Mover
 */
public class PropertySizeDaoImpl extends JpaController implements PropertySizeDao {

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

    @Override
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

    @Override
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

    @Override
    public PropertySize findProperty(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PropertySize.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Property> findPropertySizeEntities() {
        return findPropertySizeEntities(true, -1, -1);
    }

    @Override
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

    @Override
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
    @Override
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
