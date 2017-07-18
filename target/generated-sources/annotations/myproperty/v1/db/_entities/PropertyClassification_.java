package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.PropertyTypes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-14T15:39:50")
@StaticMetamodel(PropertyClassification.class)
public class PropertyClassification_ { 

    public static volatile CollectionAttribute<PropertyClassification, PropertyTypes> propertyTypesCollection;
    public static volatile SingularAttribute<PropertyClassification, Integer> id;
    public static volatile SingularAttribute<PropertyClassification, String> abbrev;
    public static volatile SingularAttribute<PropertyClassification, String> classification;

}