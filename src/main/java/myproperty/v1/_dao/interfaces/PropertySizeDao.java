/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1.db._entities.Property;
import myproperty.v1.db._entities.PropertySize;

/**
 *
 * @author mover 7/9/2017
 */
public interface PropertySizeDao {

    PropertySize create(PropertySize propertySize) throws Exception;

    void destroy(Integer id) throws Exception;

    PropertySize edit(PropertySize propertySize) throws Exception;

    PropertySize findPropertySize(Integer id);

    List<PropertySize> findPropertySizeEntities();

    List<PropertySize> findPropertySizeEntities(int maxResults, int firstResult);

    //TODO: Get Property Size  By Property Id
    List<PropertySize> findPropertySizeEntitiesByPropertyId(Integer propertyId, int maxResults, int firstResult);

}
