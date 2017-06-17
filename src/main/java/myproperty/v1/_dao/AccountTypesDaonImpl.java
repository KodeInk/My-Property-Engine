/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao;

import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import myproperty.v1._entities.AccountTypes;
import myproperty.v1.db.Entity;
import myproperty.v1.db.JpaController;

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

    @Override
    public List getMainIds(boolean all, Object startMainId, Integer offset, Integer limit) {
        return super.getMainIds(all, startMainId, offset, limit); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Entity entity) throws Exception {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findByNamedQuery(String namedQuery, String[] parameterKeys, Object[] parameterValues, String logId) {
        return super.findByNamedQuery(namedQuery, parameterKeys, parameterValues, logId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findEntities(int maxResults, int firstResult) {
        return super.findEntities(maxResults, firstResult); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findEntities() {
        return super.findEntities(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entity find(Integer id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer create(Entity entity) {
        return super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntityManager getEntityManager() {
        return super.getEntityManager(); //To change body of generated methods, choose Tools | Templates.
    }


}
