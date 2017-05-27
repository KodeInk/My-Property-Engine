/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao;

import myproperty._entities.Person;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import myproperty._entities.User;
import myproperty.db.JpaController;
import myproperty.helper.exception.InternalErrorException;

/**
 * mover
 */
public class PersonDAOImpl extends JpaController implements PersonDAO {

    private static final Logger LOG = Logger.getLogger(PersonDAOImpl.class.getName());

    private static PersonDAOImpl instance = null;

    //singleton implementation
    public static PersonDAOImpl getInstance() {
        if (instance == null) {
            instance = new PersonDAOImpl();
        }
        return instance;

    }

    public PersonDAOImpl() {
        super(Person.class);
    }

    @Override
    public Person create(Person person) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(person);
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
        return person;
    }

    @Override
    public Person edit(Person person) throws Exception {

        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            person = em.merge(person);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = person.getId();

                if (findPerson(id) == null) {
                    throw new Exception("The  Person  with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return person;
    }

    @Override
    public Person findPerson(Integer id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            return em.find(Person.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Person> findUserEntities() throws Exception {
        return findUserEntities(true, -1, -1);
    }

    @Override
    public List<Person> findUserEntities(int maxResults, int firstResult) throws Exception {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<Person> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
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
    public void deletePerson(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Person person;
            try {
                person = em.getReference(Person.class, id);
                person.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The User  with id " + id + " no longer exists.", enfe);
            }
            em.remove(person);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Person> findPersonByUserid(Integer userId) throws Exception {
        EntityManager em = null;
        List<Person> person = null;

        try {
            em = getEntityManager();
            TypedQuery<Person> query = em.createNamedQuery("Person.findPersonByUserId", Person.class);
            query.setParameter("userId", userId);
            person = query.getResultList();

        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em == null) {
            } else {
                em.close();
            }
        }

        return person;
    }


}
