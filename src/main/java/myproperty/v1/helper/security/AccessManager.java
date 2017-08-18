/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.helper.security;

import java.util.logging.Logger;

/**
 *
 * @author mover 8172017
 */
public class AccessManager {

    private static final Logger LOG = Logger.getLogger(AccessManager.class.getName());
    private static AccessManager instance = null;

    private static String[] permissions;

    public static AccessManager getInstance() {
        if (instance == null) {
            instance = new AccessManager();
        }
        return instance;
    }

    public static Boolean check_user_access(String[] permissions, String authorization) {
        AccessManager.permissions = permissions;
// get logged in User Permissions ::
// pass the permission Array 

        //Todo: permission 
        return false;
    }
}
