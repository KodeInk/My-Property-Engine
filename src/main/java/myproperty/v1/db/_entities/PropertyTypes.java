/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mover
 */
@Entity
@Table(name = "property_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertyTypes.findAll", query = "SELECT p FROM PropertyTypes p")
    , @NamedQuery(name = "PropertyTypes.findById", query = "SELECT p FROM PropertyTypes p WHERE p.id = :id")
    , @NamedQuery(name = "PropertyTypes.findByType", query = "SELECT p FROM PropertyTypes p WHERE p.type = :type")
    , @NamedQuery(name = "PropertyTypes.findByStatus", query = "SELECT p FROM PropertyTypes p WHERE p.status = :status")})
public class PropertyTypes implements Serializable {

    @OneToMany(mappedBy = "type")
    private Collection<Property> propertyCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "classification_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PropertyClassification classificationId;


    public PropertyTypes() {
    }

    public PropertyTypes(Integer id) {
        this.id = id;
    }

    public PropertyTypes(Integer id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PropertyClassification getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(PropertyClassification classificationId) {
        this.classificationId = classificationId;
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
        if (!(object instanceof PropertyTypes)) {
            return false;
        }
        PropertyTypes other = (PropertyTypes) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "myproperty.v1._controller.PropertyTypes[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Property> getPropertyCollection() {
        return propertyCollection;
    }

    public void setPropertyCollection(Collection<Property> propertyCollection) {
        this.propertyCollection = propertyCollection;
    }

}
