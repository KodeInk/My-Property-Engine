/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao;

import myproperty._dao.interfaces.AddressDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty._entities.Address;
import myproperty.db.JpaController;
import myproperty.helper.exception.InternalErrorException;

/**
 *
 * @author Mover
 */
public class AddressDaoImpl extends JpaController implements AddressDao {
    private static final Logger LOG = Logger.getLogger(AddressDaoImpl.class.getName());
    private static AddressDaoImpl instance = null;

    public static AddressDaoImpl getInstance() {
        if (instance == null) {
            instance = new AddressDaoImpl();
        }
        return instance;
    }

    public AddressDaoImpl() {
        super(Address.class);
    }

    @Override
    public Address create(Address address) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(address);
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
        return address;
    }

    @Override
    public Address edit(Address address) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            address = em.merge(address);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = address.getId();

                if (findAddress(id) == null) {
                    throw new Exception("The  Person  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return address;
    }

    @Override
    public Address findAddress(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(Address.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Address> findAddressrEntities() throws Exception {
        return findAddressEntities(true, -1, -1);
    }

    @Override
    public List<Address> findAddressEntities(int maxResults, int firstResult) throws Exception {
        return findAddressEntities(false, maxResults, firstResult);
    }

    private List<Address> findAddressEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Address.class));
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
    public void deleteAddress(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Address address;
            try {
                address = em.getReference(Address.class, id);
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
    public List<Address> findAddressesByUserId(Integer userId) throws Exception {
        EntityManager em = getEntityManager();
        try {
            // return em.find(Address.class, id);
            Query query = em.createNamedQuery("Address.findByUserid");
            query.setParameter("userId", userId);
            List<Address> addresses = query.getResultList();
            return addresses;
        } finally {
            em.close();
        }
    }





}
