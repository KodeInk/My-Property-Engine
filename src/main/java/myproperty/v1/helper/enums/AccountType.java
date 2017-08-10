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
public enum AccountType {
    NORMAL, GROUP, COMPANY;

    public static final AccountType fromString(String text) {
        AccountType returnValue = NORMAL;

        try {
            if (text != null) {
                returnValue = AccountType.valueOf(text.toUpperCase());
            }
        } catch (IllegalArgumentException e) {

            returnValue = NORMAL;
        }

        return returnValue;
    }

    public static final AccountType fromObject(Object text) {
        return fromString(text.toString());
    }
}
