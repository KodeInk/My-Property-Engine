/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mover 7/6/2017
 */
public class _Property {

    private Integer id;
    private Date dateCreated;
    private Date dateUpdated;
    private String brief;
    private String status;
    private String details;
    private Integer accountId;
    private Integer userId;
    private _property_size property_size;

    public _Property() {
    }

    public _Property(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public _property_size getProperty_size() {
        return property_size;
    }

    public void setProperty_size(_property_size property_size) {
        this.property_size = property_size;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.dateCreated);
        hash = 59 * hash + Objects.hashCode(this.dateUpdated);
        hash = 59 * hash + Objects.hashCode(this.brief);
        hash = 59 * hash + Objects.hashCode(this.status);
        hash = 59 * hash + Objects.hashCode(this.details);
        hash = 59 * hash + Objects.hashCode(this.accountId);
        hash = 59 * hash + Objects.hashCode(this.userId);
        hash = 59 * hash + Objects.hashCode(this.property_size);
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
        final _Property other = (_Property) obj;
        if (!Objects.equals(this.brief, other.brief)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.details, other.details)) {
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
        if (!Objects.equals(this.accountId, other.accountId)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        return Objects.equals(this.property_size, other.property_size);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", dateCreated=" + dateCreated
                + ", dateUpdated=" + dateUpdated
                + ", brief=" + brief
                + ", status=" + status
                + ", details=" + details
                + ", accountId=" + accountId
                + ", userId=" + userId
                + ", property_size=" + property_size
                + "}";
    }

}
