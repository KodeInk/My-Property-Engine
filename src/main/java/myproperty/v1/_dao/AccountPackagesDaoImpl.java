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
import myproperty.v1._entities.Address;
import myproperty.v1._entities.Packages;
import myproperty.v1.db.JpaController;
import myproperty.v1.helper.exception.InternalErrorException;

/**
 *
 * @author mover 6/18/2017
 */
public class AccountPackagesDaoImpl extends JpaController {

    private static final Logger LOG = Logger.getLogger(AccountPackagesDaoImpl.class.getName());
    private static AccountPackagesDaoImpl instance = null;

    public static AccountPackagesDaoImpl getInstance() {
        if (instance == null) {
            instance = new AccountPackagesDaoImpl();
        }
        return instance;
    }

    public AccountPackagesDaoImpl() {
        super(Packages.class);
    }

    public Packages create(Packages packages) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(packages);
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
        return packages;
    }

    public Packages edit(Packages packages) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            packages = em.merge(packages);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = packages.getId();

                if (findPackages(id) == null) {
                    throw new Exception("The  Account Type  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return packages;
    }

    public Packages findPackages(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(Packages.class, id);
        } finally {
            em.close();
        }
    }

    public List<Packages> findPackagesEntities() throws Exception {
        return findPackagesEntities(true, -1, -1);
    }

    public List<Packages> findPackagesEntities(int maxResults, int firstResult) throws Exception {
        return findPackagesEntities(false, maxResults, firstResult);
    }

    private List<Packages> findPackagesEntities(boolean all, int maxResults, int firstResult) {
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

    public Packages findAccountType(String accountType) throws Exception {
        EntityManager em = getEntityManager();
        try {
            // return em.find(Address.class, id);
            Query query = em.createNamedQuery("Packages.findByAccountType");
            query.setParameter("accountType", accountType);
            List<Packages> accountTypes = query.getResultList();
            return accountTypes.get(0);
        } finally {
            em.close();
        }

    }

}
