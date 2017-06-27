/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1._entities.Property;

/**
 *
 * @author mover 6/24/2017
 */
public interface PropertyDao {

    void destroy(Integer id) throws Exception;

    Property edit(Property property) throws Exception;

    Property findProperty(Integer id);

    List<Property> findPropertyEntities();

    List<Property> findPropertyEntities(int maxResults, int firstResult);

    public Property create(Property property) throws Exception;

}
