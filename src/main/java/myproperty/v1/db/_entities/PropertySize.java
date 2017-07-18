/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mover 7/9/2017
 */
@Entity
@Table(name = "property_size")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertySize.findAll", query = "SELECT p FROM PropertySize p")
    , @NamedQuery(name = "PropertySize.findById", query = "SELECT p FROM PropertySize p WHERE p.id = :id")
    , @NamedQuery(name = "PropertySize.findBySize", query = "SELECT p FROM PropertySize p WHERE p.size = :size")
    , @NamedQuery(name = "PropertySize.findByUnitMeasure", query = "SELECT p FROM PropertySize p WHERE p.unitMeasure = :unitMeasure")
    , @NamedQuery(name = "PropertySize.findByPropertyId", query = "SELECT p FROM PropertySize p WHERE p.property.id = :propertyId")


})
public class PropertySize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)

    @Size(min = 1, max = 255)
    @Column(name = "size")
    private String size;
    @Basic(optional = false)

    @Size(min = 1, max = 9)
    @Column(name = "unitMeasure")
    private String unitMeasure;
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Property property;

    public PropertySize() {
    }

    public PropertySize(Integer id) {
        this.id = id;
    }

    public PropertySize(Integer id, String size, String unitMeasure) {
        this.id = id;
        this.size = size;
        this.unitMeasure = unitMeasure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertySize)) {
            return false;
        }
        PropertySize other = (PropertySize) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{ id=" + id + "}";
    }

}
