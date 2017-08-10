/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1.db._entities.UserRole;

/**
 *
 * @author Mover 8/5/2017
 */
public interface UserRoleDao {

    UserRole create(UserRole userRole);

    void destroy(Integer id) throws Exception;

    UserRole edit(UserRole userRole) throws Exception;

    UserRole findUserRole(Integer id);

    List<UserRole> findUserRoleEntities();

    List<UserRole> findUserRoleEntities(int maxResults, int firstResult);

}
