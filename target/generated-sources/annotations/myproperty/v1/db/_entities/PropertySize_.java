package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Property;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-06T04:18:00")
@StaticMetamodel(PropertySize.class)
public class PropertySize_ { 

    public static volatile SingularAttribute<PropertySize, String> size;
    public static volatile SingularAttribute<PropertySize, Integer> id;
    public static volatile SingularAttribute<PropertySize, Property> propertyId;
    public static volatile SingularAttribute<PropertySize, String> unitMeasure;

}