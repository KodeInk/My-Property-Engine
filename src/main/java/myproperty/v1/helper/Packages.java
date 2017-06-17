/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.helper;

/**
 *
 * @author mover 6/17/2017
 */
public enum Packages {
    BASIC, BRONZE, SILVER, GOLD, PLATINUM;

    public static final Packages fromString(String text) {
        Packages returnValue = BASIC;

        try {
            if (text != null) {
                returnValue = Packages.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = BASIC;
        }

        return returnValue;
    }

    public static final Packages fromObject(Object text) {
        return fromString(text.toString());
    }
}
