/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1.db._entities.Packages;

/**
 *
 * @author mover 6/18/2017
 */
public interface AccountPackagesDao {

    Packages create(Packages packages) throws Exception;

    Packages edit(Packages packages) throws Exception;

    Packages findPackagebyName(String package_name) throws Exception;

    Packages findPackages(Integer id) throws Exception;

    List<Packages> findPackagesEntities() throws Exception;

    List<Packages> findPackagesEntities(int maxResults, int firstResult) throws Exception;

}
