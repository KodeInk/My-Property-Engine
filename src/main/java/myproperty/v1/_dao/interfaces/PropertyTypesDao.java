/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1.db._entities.PropertyTypes;

/**
 *
 * @author mover 7/20/2017
 */
public interface PropertyTypesDao {

    PropertyTypes create(PropertyTypes propertyTypes) throws Exception;

    void destroy(Integer id) throws Exception;

    PropertyTypes edit(PropertyTypes propertyTypes) throws Exception;

    PropertyTypes findPropertyType(Integer id);

    List<PropertyTypes> findPropertyTypeEntities();

    List<PropertyTypes> findPropertyTypeEntities(int maxResults, int firstResult);

}
