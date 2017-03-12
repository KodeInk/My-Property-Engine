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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "person")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
    , @NamedQuery(name = "Person.findById", query = "SELECT p FROM Person p WHERE p.id = :id")
    , @NamedQuery(name = "Person.findByNames", query = "SELECT p FROM Person p WHERE p.names = :names")
    , @NamedQuery(name = "Person.findByPrefix", query = "SELECT p FROM Person p WHERE p.prefix = :prefix")
    , @NamedQuery(name = "Person.findByStatus", query = "SELECT p FROM Person p WHERE p.status = :status")
    , @NamedQuery(name = "Person.findByGender", query = "SELECT p FROM Person p WHERE p.gender = :gender")
    , @NamedQuery(name = "Person.findByDateCreated", query = "SELECT p FROM Person p WHERE p.dateCreated = :dateCreated")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "names")
    private String names;
    @Size(max = 3)
    @Column(name = "prefix")
    private String prefix;
    @Size(max = 19)
    @Column(name = "status")
    private String status;
    @Size(max = 6)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<AccountType> accountTypeCollection;
    @OneToMany(mappedBy = "authorId")
    private Collection<Types> typesCollection;
    @OneToMany(mappedBy = "authorId")
    private Collection<Address> addressCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<Roles> rolesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<Subscription> subscriptionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<Users> usersCollection;
    @OneToMany(mappedBy = "authorId")
    private Collection<UserRole> userRoleCollection;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;
    @OneToMany(mappedBy = "authorId")
    private Collection<Property> propertyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<RolePermission> rolePermissionCollection;
    @OneToMany(mappedBy = "authorId")
    private Collection<SubscriptionPermission> subscriptionPermissionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<Categories> categoriesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "authorId")
    private Collection<Account> accountCollection;

    public Person() {
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, Date dateCreated) {
        this.id = id;
        this.dateCreated = dateCreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @XmlTransient
    public Collection<AccountType> getAccountTypeCollection() {
        return accountTypeCollection;
    }

    public void setAccountTypeCollection(Collection<AccountType> accountTypeCollection) {
        this.accountTypeCollection = accountTypeCollection;
    }

    @XmlTransient
    public Collection<Types> getTypesCollection() {
        return typesCollection;
    }

    public void setTypesCollection(Collection<Types> typesCollection) {
        this.typesCollection = typesCollection;
    }

    @XmlTransient
    public Collection<Address> getAddressCollection() {
        return addressCollection;
    }

    public void setAddressCollection(Collection<Address> addressCollection) {
        this.addressCollection = addressCollection;
    }

    @XmlTransient
    public Collection<Roles> getRolesCollection() {
        return rolesCollection;
    }

    public void setRolesCollection(Collection<Roles> rolesCollection) {
        this.rolesCollection = rolesCollection;
    }

    @XmlTransient
    public Collection<Subscription> getSubscriptionCollection() {
        return subscriptionCollection;
    }

    public void setSubscriptionCollection(Collection<Subscription> subscriptionCollection) {
        this.subscriptionCollection = subscriptionCollection;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
    }

    @XmlTransient
    public Collection<UserRole> getUserRoleCollection() {
        return userRoleCollection;
    }

    public void setUserRoleCollection(Collection<UserRole> userRoleCollection) {
        this.userRoleCollection = userRoleCollection;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @XmlTransient
    public Collection<Property> getPropertyCollection() {
        return propertyCollection;
    }

    public void setPropertyCollection(Collection<Property> propertyCollection) {
        this.propertyCollection = propertyCollection;
    }

    @XmlTransient
    public Collection<RolePermission> getRolePermissionCollection() {
        return rolePermissionCollection;
    }

    public void setRolePermissionCollection(Collection<RolePermission> rolePermissionCollection) {
        this.rolePermissionCollection = rolePermissionCollection;
    }

    @XmlTransient
    public Collection<SubscriptionPermission> getSubscriptionPermissionCollection() {
        return subscriptionPermissionCollection;
    }

    public void setSubscriptionPermissionCollection(Collection<SubscriptionPermission> subscriptionPermissionCollection) {
        this.subscriptionPermissionCollection = subscriptionPermissionCollection;
    }

    @XmlTransient
    public Collection<Categories> getCategoriesCollection() {
        return categoriesCollection;
    }

    public void setCategoriesCollection(Collection<Categories> categoriesCollection) {
        this.categoriesCollection = categoriesCollection;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproperty._entities.Person[ id=" + id + " ]";
    }

}
