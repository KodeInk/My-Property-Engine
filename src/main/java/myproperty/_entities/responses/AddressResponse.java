/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities.responses;

import java.util.Date;
import java.util.Objects;
import myproperty.helper.ParentTypes;

/**
 *
 * @author Mover
 */
public class AddressResponse {

    private Integer id;
    private String location;
    private String lat;
    private String lng;
    private Date datecreated;
    private Date dateupdated;
    private String status;
    private UserResponse createdby;
    private UserResponse updatedby;
    private String parent_type;
    private Integer parent_id;


    public AddressResponse() {
    }

    public AddressResponse(Integer id, String location, String lat, String lng) {
        this.id = id;
        this.location = location;
        this.lat = lat;
        this.lng = lng;
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

    public UserResponse getCreatedby() {
        return createdby;
    }

    public void setCreatedby(UserResponse createdby) {
        this.createdby = createdby;
    }

    public UserResponse getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(UserResponse updatedby) {
        this.updatedby = updatedby;
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
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.lat);
        hash = 37 * hash + Objects.hashCode(this.lng);
        hash = 37 * hash + Objects.hashCode(this.datecreated);
        hash = 37 * hash + Objects.hashCode(this.dateupdated);
        hash = 37 * hash + Objects.hashCode(this.status);
        hash = 37 * hash + Objects.hashCode(this.createdby);
        hash = 37 * hash + Objects.hashCode(this.updatedby);
        hash = 37 * hash + Objects.hashCode(this.parent_type);
        hash = 37 * hash + Objects.hashCode(this.parent_id);
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
        final AddressResponse other = (AddressResponse) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.lat, other.lat)) {
            return false;
        }
        if (!Objects.equals(this.lng, other.lng)) {
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
        if (!Objects.equals(this.datecreated, other.datecreated)) {
            return false;
        }
        if (!Objects.equals(this.dateupdated, other.dateupdated)) {
            return false;
        }
        if (!Objects.equals(this.createdby, other.createdby)) {
            return false;
        }
        if (!Objects.equals(this.updatedby, other.updatedby)) {
            return false;
        }
        return Objects.equals(this.parent_id, other.parent_id);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", location=" + location
                + ", lat=" + lat
                + ", lng=" + lng
                + ", datecreated=" + datecreated
                + ", dateupdated=" + dateupdated
                + ", status=" + status
                + ", createdby=" + createdby
                + ", updatedby=" + updatedby
                + ", parent_type=" + parent_type
                + ", parent_id=" + parent_id
                + '}';
    }

}
