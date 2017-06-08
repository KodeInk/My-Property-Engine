/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mover
 */
@Entity
@Table(name = "address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
    , @NamedQuery(name = "Address.findById", query = "SELECT a FROM Address a WHERE a.id = :id")
    , @NamedQuery(name = "Address.findByLocation", query = "SELECT a FROM Address a WHERE a.location = :location")
    , @NamedQuery(name = "Address.findByLat", query = "SELECT a FROM Address a WHERE a.lat = :lat")
    , @NamedQuery(name = "Address.findByLng", query = "SELECT a FROM Address a WHERE a.lng = :lng")
    , @NamedQuery(name = "Address.findByDatecreated", query = "SELECT a FROM Address a WHERE a.datecreated = :datecreated")
    , @NamedQuery(name = "Address.findByDateupdated", query = "SELECT a FROM Address a WHERE a.dateupdated = :dateupdated")
    , @NamedQuery(name = "Address.findByStatus", query = "SELECT a FROM Address a WHERE a.status = :status")
    , @NamedQuery(name = "Address.findByParent", query = "SELECT a FROM Address a WHERE a.parentId = :parent_id AND a.parentType LIKE :parent_type")

}
)
public class Address implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)

    @Size(min = 1, max = 255)
    @Column(name = "location")
    private String location;
    @Basic(optional = false)

    @Size(min = 1, max = 255)
    @Column(name = "lat")
    private String lat;
    @Basic(optional = false)

    @Size(min = 1, max = 255)
    @Column(name = "lng")
    private String lng;
    @Basic(optional = false)

    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Basic(optional = false)

    @Column(name = "dateupdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateupdated;
    @Basic(optional = false)

    @Size(min = 1, max = 8)
    @Column(name = "status")
    private String status;

    @JoinColumn(name = "createdby", referencedColumnName = "id")
    @ManyToOne(optional = true)
    private User createdby;
    @JoinColumn(name = "updatedby", referencedColumnName = "id")
    @ManyToOne(optional = true)

    private User updatedby;

    // Important Columns 
    @Size(max = 255)
    @Column(name = "parent_type")
    private String parentType;
    @Column(name = "parent_id")
    private Integer parentId;


    public Address() {
    }

    public Address(Integer id) {
        this.id = id;
    }

    public Address(Integer id, String location, String lat, String lng, Date datecreated, String status) {
        this.id = id;
        this.location = location;
        this.lat = lat;
        this.lng = lng;
        this.datecreated = datecreated;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Date dateupdated) {
        this.dateupdated = dateupdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getCreatedby() {
        return createdby;
    }

    public void setCreatedby(User createdby) {
        this.createdby = createdby;
    }

    public User getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(User updatedby) {
        this.updatedby = updatedby;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "myproperty._entities.Address[ id=" + id + " ]";
    }

}
