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
public enum RolesEnum {

    SUPERADMIN, ADMINISTRATOR;

    public static final RolesEnum fromString(String text) {
        RolesEnum returnValue = SUPERADMIN;

        try {
            if (text != null) {
                returnValue = RolesEnum.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = SUPERADMIN;
        }

        return returnValue;
    }

    public static final RolesEnum fromObject(Object text) {
        return fromString(text.toString());
    }

}
