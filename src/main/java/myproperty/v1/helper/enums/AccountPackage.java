/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.helper.enums;

/**
 *
 * @author mover 6/17/2017
 */
public enum AccountPackage {
    BASIC, GOLD, PREMIUM;

    public static final AccountPackage fromString(String text) {
        AccountPackage returnValue = BASIC;

        try {
            if (text != null) {
                returnValue = AccountPackage.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = BASIC;
        }

        return returnValue;
    }

    public static final AccountPackage fromObject(Object text) {
        return fromString(text.toString());
    }
}
