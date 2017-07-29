/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.helper.enums;

/**
 *
 * @author mover 7/20/2017
 *
 *
 */
public enum Roles {

    SUPERADMIN, ADMINISTRATOR;

    public static final Roles fromString(String text) {
        Roles returnValue = SUPERADMIN;

        try {
            if (text != null) {
                returnValue = Roles.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = SUPERADMIN;
        }

        return returnValue;
    }

    public static final Roles fromObject(Object text) {
        return fromString(text.toString());
    }

}
