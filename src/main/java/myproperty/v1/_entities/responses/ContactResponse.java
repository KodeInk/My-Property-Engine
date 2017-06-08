/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._entities.responses;

import java.util.Date;
import java.util.Objects;
import myproperty.v1._entities.User;

/**
 *
 * @author mover 6/8/2017
 */
public class ContactResponse {
    private Integer id;
    private String type;
    private String details;
    private Date dateCreated;
    private Date dateUpdated;
    private String status;
    private UserResponse createdBy;
    private UserResponse updatedBy;
    private String parent_type;
    private Integer parent_id;

    public ContactResponse() {
    }

    public ContactResponse(Integer id, String type, String details, String parent_type, Integer parent_id) {
        this.id = id;
        this.type = type;
        this.details = details;
        this.parent_type = parent_type;
        this.parent_id = parent_id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserResponse getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserResponse createdBy) {
        this.createdBy = createdBy;
    }

    public UserResponse getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserResponse updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getParent_type() {
        return parent_type;
    }

    public void setParent_type(String parent_type) {
        this.parent_type = parent_type;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + Objects.hashCode(this.details);
        hash = 79 * hash + Objects.hashCode(this.dateCreated);
        hash = 79 * hash + Objects.hashCode(this.dateUpdated);
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + Objects.hashCode(this.createdBy);
        hash = 79 * hash + Objects.hashCode(this.updatedBy);
        hash = 79 * hash + Objects.hashCode(this.parent_type);
        hash = 79 * hash + Objects.hashCode(this.parent_id);
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
        final ContactResponse other = (ContactResponse) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.details, other.details)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.parent_type, other.parent_type)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateCreated, other.dateCreated)) {
            return false;
        }
        if (!Objects.equals(this.dateUpdated, other.dateUpdated)) {
            return false;
        }
        if (!Objects.equals(this.createdBy, other.createdBy)) {
            return false;
        }
        if (!Objects.equals(this.updatedBy, other.updatedBy)) {
            return false;
        }
        return Objects.equals(this.parent_id, other.parent_id);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", type=" + type
                + ", details=" + details
                + ", dateCreated=" + dateCreated
                + ", dateUpdated=" + dateUpdated
                + ", status=" + status
                + ", createdBy=" + createdBy
                + ", updatedBy=" + updatedBy
                + ", parent_type=" + parent_type
                + ", parent_id=" + parent_id
                + '}';
    }

}
