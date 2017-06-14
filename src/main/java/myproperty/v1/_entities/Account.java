/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._entities;

/**
 *
 * @author mover 6/12/2017
 */
public class Account {

    private String names;
    private String password;
    private String email_address;

    public Account(String names, String password, String email_address) {
        this.names = names;
        this.password = password;
        this.email_address = email_address;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }


}
