/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper;

/**
 *
 * @author Mover 5/21/2017
 */
public enum StatusEnum {

    ACTIVE, DEACTIVATED, PENDING, ARCHIVED;

    public static final StatusEnum fromString(String text) {
        StatusEnum returnValue = PENDING;

        try {
            if (text != null) {
                returnValue = StatusEnum.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = PENDING;
        }

        return returnValue;
    }

    public static final StatusEnum fromObject(Object text) {
        return fromString(text.toString());
    }

}
