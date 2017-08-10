/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities.responses;

import java.util.List;

/**
 *
 * @author mover
 */
/*
        THIS CLASS IS MEANT TO ACT AS A RESPONSE TO THE ACCOUNT LOGIN IF SUCCESSFUL
       SINCE WE ARE DEALING WITH STATE LESS APPLICATIONS
       WE ARE WORKING WITH AUTHORIZATION AND SET OF PERMISSIONS THAT THE CLIENT WILL USE TO
       CHANGE THE MENU ITEMS  WHENEVER ITS REQUIRED
 
 */
public class AuthenticationResponse {

    private String authorization;
    private List<PermissionsResponse> permissions;
    private Boolean isLoggedIn;

    public AuthenticationResponse() {
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public List<PermissionsResponse> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionsResponse> permissions) {
        this.permissions = permissions;
    }

    public Boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(Boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }


    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "authorization=" + authorization
                + ", permissions=" + permissions
                + ", isLoggedIn=" + isLoggedIn
                + "}";
    }

}
