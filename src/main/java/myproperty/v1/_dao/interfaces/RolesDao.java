package myproperty.v1._dao.interfaces;


import java.util.List;
import myproperty.v1.db._entities.Roles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mover
 */
public interface RolesDao {

    Roles create(Roles roles) throws Exception;

    void deleteRoles(Integer id) throws Exception;

    Roles edit(Roles roles) throws Exception;

    List<Roles> findARolesEntities(int maxResults, int firstResult) throws Exception;

    Roles findRole(Integer id) throws Exception;

    Roles findRoleByName(String name) throws Exception;

    List<Roles> findRolesrEntities() throws Exception;

}
