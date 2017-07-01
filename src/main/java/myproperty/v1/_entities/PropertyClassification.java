/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._entities;

import myproperty.v1._entities.PropertyTypes;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author Manny
 */
@Entity
@Table(name = "property_classification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertyClassification.findAll", query = "SELECT p FROM PropertyClassification p")
    , @NamedQuery(name = "PropertyClassification.findById", query = "SELECT p FROM PropertyClassification p WHERE p.id = :id")
    , @NamedQuery(name = "PropertyClassification.findByClassification", query = "SELECT p FROM PropertyClassification p WHERE p.classification = :classification")
    , @NamedQuery(name = "PropertyClassification.findByAbbrev", query = "SELECT p FROM PropertyClassification p WHERE p.abbrev = :abbrev")})
public class PropertyClassification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "classification")
    private String classification;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "abbrev")
    private String abbrev;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classificationId")
    private Collection<PropertyTypes> propertyTypesCollection;

    public PropertyClassification() {
    }

    public PropertyClassification(Integer id) {
        this.id = id;
    }

    public PropertyClassification(Integer id, String classification, String abbrev) {
        this.id = id;
        this.classification = classification;
        this.abbrev = abbrev;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    @XmlTransient
    public Collection<PropertyTypes> getPropertyTypesCollection() {
        return propertyTypesCollection;
    }

    public void setPropertyTypesCollection(Collection<PropertyTypes> propertyTypesCollection) {
        this.propertyTypesCollection = propertyTypesCollection;
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
        if (!(object instanceof PropertyClassification)) {
            return false;
        }
        PropertyClassification other = (PropertyClassification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproperty.v1._controller.PropertyClassification[ id=" + id + " ]";
    }

}
