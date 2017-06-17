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
public enum AccountPackage {
    FREE, BRONZE, SILVER, GOLD, PLATINUM;

    public static final AccountPackage fromString(String text) {
        AccountPackage returnValue = FREE;

        try {
            if (text != null) {
                returnValue = AccountPackage.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = FREE;
        }

        return returnValue;
    }

    public static final AccountPackage fromObject(Object text) {
        return fromString(text.toString());
    }
}
