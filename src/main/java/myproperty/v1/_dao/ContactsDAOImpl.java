/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import myproperty.v1._dao.interfaces.ContactsDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1.db._entities.Contacts;
import myproperty.v1.db.JpaController;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author Mover 6/8/2017
 */
public class ContactsDAOImpl extends JpaController implements ContactsDAO {

    private static final Logger LOG = Logger.getLogger(ContactsDAOImpl.class.getName());
    private static ContactsDAOImpl instance = null;

    public static ContactsDAOImpl getInstance() {
        if (instance == null) {
            instance = new ContactsDAOImpl();
        }
        return instance;
    }

    public ContactsDAOImpl() {
        super(Contacts.class);
    }

    @Override
    public Contacts create(Contacts contacts) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacts);
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
        return contacts;
    }

    @Override
    public Contacts edit(Contacts contacts) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            contacts = em.merge(contacts);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = contacts.getId();

                if (findContacts(id) == null) {
                    throw new Exception("The  Person  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return contacts;
    }

    @Override
    public Contacts findContacts(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(Contacts.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Contacts> findContactsrEntities() throws Exception {
        return findContactsEntities(true, -1, -1);
    }

    @Override
    public List<Contacts> findContactsEntities(int maxResults, int firstResult) throws Exception {
        return findContactsEntities(false, maxResults, firstResult);
    }

    private List<Contacts> findContactsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contacts.class));
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
    public void deleteContacts(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contacts address;
            try {
                address = em.getReference(Contacts.class, id);
                address.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The User  with id " + id + " no longer exists.", enfe);
            }
            em.remove(address);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<Contacts> findContactsesByUserId(Integer userId) throws Exception {
        EntityManager em = getEntityManager();
        try {
            // return em.find(Contacts.class, id);
            Query query = em.createNamedQuery("Contacts.findByUserid");
            query.setParameter("userId", userId);
            List<Contacts> addresses = query.getResultList();
            return addresses;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Contacts> findContactses(Integer parent_id, String parent_type) throws Exception {
        EntityManager em = getEntityManager();
        try {
            // return em.find(Contacts.class, id);
            Query query = em.createNamedQuery("Contacts.findByParent");
            query.setParameter("parent_id", parent_id);
            query.setParameter("parent_type", parent_type);

            List<Contacts> addresses = query.getResultList();
            return addresses;
        } finally {
            em.close();
        }

    }

}
