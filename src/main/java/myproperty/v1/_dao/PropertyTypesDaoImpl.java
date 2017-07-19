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
import myproperty.v1.db._entities.PropertyTypes;

/**
 *
 * @author mover 7/20/2017
 */
public class PropertyTypesDaoImpl extends JpaController {

    private static final Logger LOG = Logger.getLogger(PropertyTypesDaoImpl.class.getName());

    private static PropertyTypesDaoImpl instance = null;

    public static PropertyTypesDaoImpl getInstance() {
        if (instance == null) {
            instance = new PropertyTypesDaoImpl();
        }
        return instance;
    }

    public PropertyTypesDaoImpl() {
        super(PropertyTypes.class);
    }

    public PropertyTypes create(PropertyTypes propertyTypes) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(propertyTypes);
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
        return propertyTypes;
    }

    public PropertyTypes edit(PropertyTypes propertyTypes) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            propertyTypes = em.merge(propertyTypes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = propertyTypes.getId();

                if (findPropertyType(id) == null) {
                    throw new Exception("The Property Type  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return propertyTypes;
    }

    public PropertyTypes findPropertyType(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PropertyTypes.class, id);
        } finally {
            em.close();
        }
    }

    public List<PropertyTypes> findPropertyTypeEntities() {
        return findPropertyTypesEntities(true, -1, -1);
    }

    public List<PropertyTypes> findPropertyTypeEntities(int maxResults, int firstResult) {
        return findPropertyTypesEntities(false, maxResults, firstResult);
    }

    private List<PropertyTypes> findPropertyTypesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PropertyTypes.class));
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
            PropertyTypes propertyTypes;
            try {
                propertyTypes = em.getReference(PropertyTypes.class, id);
                propertyTypes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The Property Type  with id " + id + " no longer exists.", enfe);
            }
            em.remove(propertyTypes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }



}
