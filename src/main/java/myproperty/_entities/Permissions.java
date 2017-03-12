/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities;

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
@Table(name = "permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissions.findAll", query = "SELECT p FROM Permissions p")
    , @NamedQuery(name = "Permissions.findById", query = "SELECT p FROM Permissions p WHERE p.id = :id")
    , @NamedQuery(name = "Permissions.findByGrouping", query = "SELECT p FROM Permissions p WHERE p.grouping = :grouping")
    , @NamedQuery(name = "Permissions.findByCode", query = "SELECT p FROM Permissions p WHERE p.code = :code")
    , @NamedQuery(name = "Permissions.findByDisplayName", query = "SELECT p FROM Permissions p WHERE p.displayName = :displayName")
    , @NamedQuery(name = "Permissions.findByPermissionscol", query = "SELECT p FROM Permissions p WHERE p.permissionscol = :permissionscol")
    , @NamedQuery(name = "Permissions.findByStatus", query = "SELECT p FROM Permissions p WHERE p.status = :status")})
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "grouping")
    private String grouping;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "display_name")
    private String displayName;
    @Size(max = 45)
    @Column(name = "permissionscol")
    private String permissionscol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissionId")
    private Collection<RolePermission> rolePermissionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissionId")
    private Collection<SubscriptionPermission> subscriptionPermissionCollection;

    public Permissions() {
    }

    public Permissions(Integer id) {
        this.id = id;
    }

    public Permissions(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPermissionscol() {
        return permissionscol;
    }

    public void setPermissionscol(String permissionscol) {
        this.permissionscol = permissionscol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissions)) {
            return false;
        }
        Permissions other = (Permissions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproperty._entities.Permissions[ id=" + id + " ]";
    }

}
