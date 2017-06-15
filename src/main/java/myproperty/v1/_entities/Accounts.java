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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mover 6/13/2017
 */
@Entity
@Table(name = "accounts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accounts.findAll", query = "SELECT a FROM Accounts a")
    , @NamedQuery(name = "Accounts.findById", query = "SELECT a FROM Accounts a WHERE a.id = :id")
    , @NamedQuery(name = "Accounts.findByParentId", query = "SELECT a FROM Accounts a WHERE a.parentId = :parentId")
    , @NamedQuery(name = "Accounts.findByStatus", query = "SELECT a FROM Accounts a WHERE a.status = :status")
    , @NamedQuery(name = "Accounts.findByDateCreated", query = "SELECT a FROM Accounts a WHERE a.dateCreated = :dateCreated")
    , @NamedQuery(name = "Accounts.findByCreatedBy", query = "SELECT a FROM Accounts a WHERE a.createdBy = :createdBy")
    , @NamedQuery(name = "Accounts.findByDateUpdated", query = "SELECT a FROM Accounts a WHERE a.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Accounts.findByUpdatedBy", query = "SELECT a FROM Accounts a WHERE a.updatedBy = :updatedBy")})
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)

    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)

    @Size(min = 1, max = 11)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)

    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)

    @JoinColumn(name = "created_by", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User createdBy;

    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @JoinColumn(name = "account_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AccountTypes accountTypeId;
    @JoinColumn(name = "package_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Packages packageId;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User account_owner;


    public Accounts() {
    }

    public Accounts(Integer id) {
        this.id = id;
    }

    public Accounts(Integer id, int parentId, String status, Date dateCreated, User account_owner) {
        this.id = id;
        this.parentId = parentId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.account_owner = account_owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public AccountTypes getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(AccountTypes accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public Packages getPackageId() {
        return packageId;
    }

    public void setPackageId(Packages packageId) {
        this.packageId = packageId;
    }

    public User getAccount_owner() {
        return account_owner;
    }

    public void setAccount_owner(User account_owner) {
        this.account_owner = account_owner;
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
        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "myproperty.v1._entities.Accounts[ id=" + id + " ]";
    }

}
