/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manny
 */
@Entity
@Table(name = "property")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p")
    , @NamedQuery(name = "Property.findById", query = "SELECT p FROM Property p WHERE p.id = :id")
    , @NamedQuery(name = "Property.findByName", query = "SELECT p FROM Property p WHERE p.brief = :brief")
    , @NamedQuery(name = "Property.findByDescription", query = "SELECT p FROM Property p WHERE p.details = :details")
    , @NamedQuery(name = "Property.findByStatus", query = "SELECT p FROM Property p WHERE p.status = :status")
    , @NamedQuery(name = "Property.findByDateCreated", query = "SELECT p FROM Property p WHERE p.dateCreated = :dateCreated")
    , @NamedQuery(name = "Property.findByUser", query = "SELECT p FROM Property p WHERE p.user.id = :userId")
    , @NamedQuery(name = "Property.findByAccount", query = "SELECT p FROM Property p  WHERE p.account.id  = :accountId")
})
public class Property implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyId")
    private Collection<PropertySize> propertySizeCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)

    @Column(name = "dateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = true)
    @Column(name = "dateUpdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)

    @Size(min = 1, max = 75)
    @Column(name = "brief")
    private String brief;
    @Basic(optional = false)

    @Size(min = 1, max = 8)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)

    @Size(min = 1, max = 500)
    @Column(name = "details")
    private String details;
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accounts account;
    @JoinColumn(name = "userId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User user;

    @JoinColumn(name = "type", referencedColumnName = "id")
    @ManyToOne
    private PropertyTypes type;


    public Property() {
    }

    public Property(Integer id) {
        this.id = id;
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Property other = (Property) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));

    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public PropertyTypes getType() {
        return type;
    }

    public void setType(PropertyTypes type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "property[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<PropertySize> getPropertySizeCollection() {
        return propertySizeCollection;
    }

    public void setPropertySizeCollection(Collection<PropertySize> propertySizeCollection) {
        this.propertySizeCollection = propertySizeCollection;
    }



}
