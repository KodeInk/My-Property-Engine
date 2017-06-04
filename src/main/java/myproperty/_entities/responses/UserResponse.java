/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities.responses;

import java.util.Date;
import java.util.Objects;
import myproperty._entities.Person;

/**
 *
 * @author Mover 5/19/
 */
public class UserResponse {

    private Integer id;
    private String username;
    private Date dateCreated;
    private PersonResponse personResponse;

    public UserResponse() {
    }

    public UserResponse(Integer id, String username, Date dateCreated) {
        this.id = id;
        this.username = username;
        this.dateCreated = dateCreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


    public PersonResponse getPersonResponse() {
        return personResponse;
    }

    public void setPersonResponse(PersonResponse personResponse) {
        this.personResponse = personResponse;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.username);
        hash = 97 * hash + Objects.hashCode(this.dateCreated);
        hash = 97 * hash + Objects.hashCode(this.personResponse);
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
        final UserResponse other = (UserResponse) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateCreated, other.dateCreated)) {
            return false;
        }
        if (!Objects.equals(this.personResponse, other.personResponse)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", username=" + username
                + ", dateCreated=" + dateCreated
                + ", person=" + personResponse
                + '}';
    }


}
