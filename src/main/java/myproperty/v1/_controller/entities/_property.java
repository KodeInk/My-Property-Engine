/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller.entities;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import myproperty.v1.helper.exception.BadRequestException;

/**
 *
 * @author mover 7/6/2017
 */
public class _property {

    private Integer id;
    private Date dateCreated;
    private Date dateUpdated;
    private String brief;
    private String status;
    private String details;
    private Integer account;
    private Integer user;
    private _property_size[] property_size;
    private Integer type;

    // Adding in the  Address
    private String location;
    private String lat;
    private String lng;


    public _property() {
    }

    public _property(Integer id) {
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

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public _property_size[] getProperty_size() {
        return property_size;
    }

    public void setProperty_size(_property_size[] property_size) {
        this.property_size = property_size;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.dateCreated);
        hash = 11 * hash + Objects.hashCode(this.dateUpdated);
        hash = 11 * hash + Objects.hashCode(this.brief);
        hash = 11 * hash + Objects.hashCode(this.status);
        hash = 11 * hash + Objects.hashCode(this.details);
        hash = 11 * hash + Objects.hashCode(this.account);
        hash = 11 * hash + Objects.hashCode(this.user);
        hash = 11 * hash + Arrays.deepHashCode(this.property_size);
        hash = 11 * hash + Objects.hashCode(this.type);
        hash = 11 * hash + Objects.hashCode(this.location);
        hash = 11 * hash + Objects.hashCode(this.lat);
        hash = 11 * hash + Objects.hashCode(this.lng);
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
        final _property other = (_property) obj;
        if (!Objects.equals(this.brief, other.brief)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.details, other.details)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.lat, other.lat)) {
            return false;
        }
        if (!Objects.equals(this.lng, other.lng)) {
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
        if (!Objects.equals(this.account, other.account)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Arrays.deepEquals(this.property_size, other.property_size)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    public Boolean validate_property() {
        if (this.account == null || this.account <= 0 || this.getUser() == null || this.getUser() <= 0 || this.getBrief() == null || this.getDetails() == null) {
            throw new BadRequestException("Fill Madantories");
        }

        if (this.property_size == null) {
            throw new BadRequestException("Property Size is Missing");
        }

        return true;
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
                + ", accountId=" + account
                + ", userId=" + user
                + ", property_size=" + property_size
                + ", type=" + type
                + ", location=" + location
                + ", lat=" + lat
                + ", lng=" + lng
                + "}";
    }


}
