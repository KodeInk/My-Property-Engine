package myproperty.db;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Mover  on 4/28/2017.
 */
public  abstract class JpaController<T  extends  Entity> implements Serializable{
    private static final Logger LOG = Logger.getLogger(JpaController.class.getName());
    public static final EntityManagerFactoryProvider FACTORY_PROVIDER =  EntityManagerFactoryProvider.getInstance();

    private final Class<T> entityClass;
   // private final Field mainField;


    public JpaController(Class<T> entityClass) {
        this.entityClass = entityClass;
        Field f = null;


    }

    public EntityManager getEntityManager(){
        LOG.log(Level.INFO," Creating Entity Manager ");
        return FACTORY_PROVIDER.getFactory().createEntityManager();
    }

    public Integer create(T entity) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return entity.getId();
    }

    public T find(Integer id) {
        T entity;
        EntityManager em = null;
        try {
            em = getEntityManager();
            entity = em.find(entityClass, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return entity;
    }


    public List<T> findEntities() {
        return findEntities(true, -1, -1);
    }

    public List<T> findEntities(int maxResults, int firstResult) {
        return findEntities(false, maxResults, firstResult);
    }

    private List<T> findEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();

            cq.select(cq.from(entityClass));

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


    public List<T> findByNamedQuery( String namedQuery, String[] parameterKeys, Object[] parameterValues, String logId) {
        if (parameterKeys == null && parameterValues == null) {
            return null;
        } else if (parameterKeys != null && parameterValues == null) {
            return null;
        } else if (parameterKeys == null && parameterValues != null) {
            return null;
        } else if (parameterKeys.length != parameterValues.length) {
            return null;
        }

        List<T> returnValue = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            TypedQuery<T> query = em.createNamedQuery(namedQuery, entityClass);

            for (int i = 0; i < parameterValues.length; i++) {
                query.setParameter(parameterKeys[i], parameterValues[i]);
            }

            returnValue = query.getResultList();
        } catch (PersistenceException ex) {
            LOG.log(Level.SEVERE, "unexpected exception {0}\n{1}", new Object[]{ex.getMessage()});
            // don't throw WebApplicationException, force caller to handle this
        } finally {
            em.close();
        }

        return returnValue;
    }




}
