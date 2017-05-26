/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Mover
 */
public class PersonResponse {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String names;
    private String gender;
    private Date dateofbirth;
    private Date dateCreated;
    private Date dateUpdated;
    private User createdBy;
    private User updatedBy;
    private User userId;

    public PersonResponse() {
    }

    public PersonResponse(Integer id) {
        this.id = id;
    }

    public PersonResponse(Integer id, String names, String gender, Date dateofbirth, Date dateCreated, Date dateUpdated, User createdBy, User updatedBy, User userId) {
        this.id = id;
        this.names = names;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.userId = userId;
    }

    public PersonResponse(Integer id, String names, String gender, Date dateofbirth) {
        this.id = id;
        this.names = names;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
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

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.names);
        hash = 37 * hash + Objects.hashCode(this.gender);
        hash = 37 * hash + Objects.hashCode(this.dateofbirth);
        hash = 37 * hash + Objects.hashCode(this.dateCreated);
        hash = 37 * hash + Objects.hashCode(this.dateUpdated);
        hash = 37 * hash + Objects.hashCode(this.createdBy);
        hash = 37 * hash + Objects.hashCode(this.updatedBy);
        hash = 37 * hash + Objects.hashCode(this.userId);
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
        final PersonResponse other = (PersonResponse) obj;
        if (!Objects.equals(this.names, other.names)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateofbirth, other.dateofbirth)) {
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
        return Objects.equals(this.userId, other.userId);
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName() + "{"
                + "id=" + id
                + ", names=" + names
                + ", gender=" + gender
                + ", dateofbirth=" + dateofbirth
                + ", dateCreated=" + dateCreated
                + ", dateUpdated=" + dateUpdated
                + ", createdBy=" + createdBy
                + ", updatedBy=" + updatedBy
                + ", userId=" + userId
                + '}';
    }




}
