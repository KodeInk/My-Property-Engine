package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Property;
import myproperty.v1.db._entities.PropertyClassification;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-14T15:39:50")
@StaticMetamodel(PropertyTypes.class)
public class PropertyTypes_ { 

    public static volatile SingularAttribute<PropertyTypes, Integer> id;
    public static volatile SingularAttribute<PropertyTypes, String> type;
    public static volatile SingularAttribute<PropertyTypes, PropertyClassification> classificationId;
    public static volatile CollectionAttribute<PropertyTypes, Property> propertyCollection;
    public static volatile SingularAttribute<PropertyTypes, String> status;

}