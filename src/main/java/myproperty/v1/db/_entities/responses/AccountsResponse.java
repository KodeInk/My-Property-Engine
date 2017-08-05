/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities.responses;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mover 5/15/2017
 */
public class AccountsResponse {

    private Integer id;
    private int parentId;
    private String status;
    private Date dateCreated;
    private Integer createdBy;
    private Date dateUpdated;
    private Integer updatedBy;
    private UserResponse user;
    private AuthenticationResponse authentication;


    public AccountsResponse() {
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


    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }

    public AuthenticationResponse getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AuthenticationResponse authentication) {
        this.authentication = authentication;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + this.parentId;
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.dateCreated);
        hash = 67 * hash + Objects.hashCode(this.createdBy);
        hash = 67 * hash + Objects.hashCode(this.dateUpdated);
        hash = 67 * hash + Objects.hashCode(this.updatedBy);
        hash = 67 * hash + Objects.hashCode(this.user);
        hash = 67 * hash + Objects.hashCode(this.authentication);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AccountsResponse other = (AccountsResponse) obj;
        if (this.parentId != other.parentId) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateCreated, other.dateCreated)) {
            return false;
        }
        if (!Objects.equals(this.createdBy, other.createdBy)) {
            return false;
        }
        if (!Objects.equals(this.dateUpdated, other.dateUpdated)) {
            return false;
        }
        if (!Objects.equals(this.updatedBy, other.updatedBy)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.authentication, other.authentication)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", parentId=" + parentId
                + ", status=" + status
                + ", dateCreated=" + dateCreated
                + ", createdBy=" + createdBy
                + ", dateUpdated=" + dateUpdated
                + ", updatedBy=" + updatedBy
                + ", accountOwner=" + user
                + ", authentication=" + authentication
                + "}";
    }



}
