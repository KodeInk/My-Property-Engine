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
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1._entities.AccountTypes;
import myproperty.v1._entities.Address;
import myproperty.v1.db.Entity;
import myproperty.v1.db.JpaController;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author Mover 6/17/2017
 */
public class AccountTypesDaonImpl extends JpaController {

    private static final Logger LOG = Logger.getLogger(AccountTypesDaonImpl.class.getName());
    private static AccountTypesDaonImpl instance = null;

    public static AccountTypesDaonImpl getInstance() {
        if (instance == null) {
            instance = new AccountTypesDaonImpl();
        }
        return instance;
    }

    public AccountTypesDaonImpl() {
        super(AccountTypes.class);
    }

    public AccountTypes create(AccountTypes accountTypes) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(accountTypes);
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
        return accountTypes;
    }

    public AccountTypes edit(AccountTypes accountTypes) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            accountTypes = em.merge(accountTypes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = accountTypes.getId();

                if (findAccountTypes(id) == null) {
                    throw new Exception("The  Account Type  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return accountTypes;
    }

    public AccountTypes findAccountTypes(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(AccountTypes.class, id);
        } finally {
            em.close();
        }
    }

    public List<AccountTypes> findAccountTypesEntities() throws Exception {
        return findAccountTypesEntities(true, -1, -1);
    }

    public List<AccountTypes> findAccountTypesEntities(int maxResults, int firstResult) throws Exception {
        return findAccountTypesEntities(false, maxResults, firstResult);
    }

    private List<AccountTypes> findAccountTypesEntities(boolean all, int maxResults, int firstResult) {
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

    public AccountTypes findAccountType(String Account) throws Exception {
        EntityManager em = getEntityManager();
        try {
            // return em.find(Address.class, id);
            Query query = em.createNamedQuery("Address.findByParent");
            query.setParameter("parent_id", parent_id);
            query.setParameter("parent_type", parent_type);

            List<Address> addresses = query.getResultList();
            return addresses;
        } finally {
            em.close();
        }

    }







}
