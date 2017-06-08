/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mover
 */
@Entity
@Table(name = "contacts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacts.findAll", query = "SELECT c FROM Contacts c")
    , @NamedQuery(name = "Contacts.findById", query = "SELECT c FROM Contacts c WHERE c.id = :id")
    , @NamedQuery(name = "Contacts.findByType", query = "SELECT c FROM Contacts c WHERE c.type = :type")
    , @NamedQuery(name = "Contacts.findByDetails", query = "SELECT c FROM Contacts c WHERE c.details = :details")
    , @NamedQuery(name = "Contacts.findByCreatedBy", query = "SELECT c FROM Contacts c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Contacts.findByDateCreated", query = "SELECT c FROM Contacts c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Contacts.findByUpdatedBy", query = "SELECT c FROM Contacts c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Contacts.findByDateUpdated", query = "SELECT c FROM Contacts c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Contacts.findByStatus", query = "SELECT c FROM Contacts c WHERE c.status = :status")})
public class Contacts implements Serializable {

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
    @Size(min = 1, max = 255)
    @Column(name = "details")
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by")
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updated_by")
    private int updatedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "status")
    private String status;
    @JoinTable(name = "person_contact", joinColumns = {
        @JoinColumn(name = "contactId", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "personId", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Person> personCollection;

    public Contacts() {
    }

    public Contacts(Integer id) {
        this.id = id;
    }

    public Contacts(Integer id, String type, String details, int createdBy, Date dateCreated, int updatedBy, Date dateUpdated, String status) {
        this.id = id;
        this.type = type;
        this.details = details;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
        this.updatedBy = updatedBy;
        this.dateUpdated = dateUpdated;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Person> getPersonCollection() {
        return personCollection;
    }

    public void setPersonCollection(Collection<Person> personCollection) {
        this.personCollection = personCollection;
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
        if (!(object instanceof Contacts)) {
            return false;
        }
        Contacts other = (Contacts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproperty._entities.Contacts[ id=" + id + " ]";
    }

}
