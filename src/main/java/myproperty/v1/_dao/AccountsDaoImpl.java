/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import myproperty.v1._dao.interfaces.AccountsDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db.JpaController;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author mover 6/15/2017
 */
public class AccountsDaoImpl extends JpaController implements AccountsDao {

    private static final Logger LOG = Logger.getLogger(AccountsDaoImpl.class.getName());
    private static AccountsDaoImpl instance = null;

    public static AccountsDaoImpl getInstance() {
        if (instance == null) {
            instance = new AccountsDaoImpl();
        }
        return instance;
    }

    public AccountsDaoImpl() {
        super(Accounts.class);
    }

    @Override
    public Accounts create(Accounts accounts) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(accounts);
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
        return accounts;
    }

    @Override
    public Accounts edit(Accounts accounts) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            accounts = em.merge(accounts);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = accounts.getId();

                if (findAccount(id) == null) {
                    throw new Exception("The  Account  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return accounts;
    }

    @Override
    public Accounts findAccount(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(Accounts.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Accounts> findAccountsrEntities() throws Exception {
        return findAccountsEntities(true, -1, -1);
    }

    @Override
    public List<Accounts> findAccountsEntities(int maxResults, int firstResult) throws Exception {
        return findAccountsEntities(false, maxResults, firstResult);
    }

    private List<Accounts> findAccountsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Accounts.class));
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

    // this is total remove: 
    @Override
    public void deleteAccounts(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Accounts accounts;
            try {
                accounts = em.getReference(Accounts.class, id);
                accounts.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The Account  with id " + id + " no longer exists.", enfe);
            }
            em.remove(accounts);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }


}
