/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manny
 */
@Entity
@Table(name = "subscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subscription.findAll", query = "SELECT s FROM Subscription s")
    , @NamedQuery(name = "Subscription.findById", query = "SELECT s FROM Subscription s WHERE s.id = :id")
    , @NamedQuery(name = "Subscription.findByName", query = "SELECT s FROM Subscription s WHERE s.name = :name")
    , @NamedQuery(name = "Subscription.findByDateAdded", query = "SELECT s FROM Subscription s WHERE s.dateAdded = :dateAdded")})
public class Subscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person authorId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscriptionId")
    private Collection<SubscriptionPermission> subscriptionPermissionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscription")
    private Collection<Account> accountCollection;

    public Subscription() {
    }

    public Subscription(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Person getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Person authorId) {
        this.authorId = authorId;
    }

    @XmlTransient
    public Collection<SubscriptionPermission> getSubscriptionPermissionCollection() {
        return subscriptionPermissionCollection;
    }

    public void setSubscriptionPermissionCollection(Collection<SubscriptionPermission> subscriptionPermissionCollection) {
        this.subscriptionPermissionCollection = subscriptionPermissionCollection;
    }

    @XmlTransient
    public Collection<Account> getAccountCollection() {
        return accountCollection;
    }

    public void setAccountCollection(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
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
        if (!(object instanceof Subscription)) {
            return false;
        }
        Subscription other = (Subscription) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproperty._entities.Subscription[ id=" + id + " ]";
    }

}
