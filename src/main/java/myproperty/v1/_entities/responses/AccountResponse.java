/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._entities.responses;

import java.util.Date;

/**
 *
 * @author Mover 6/13/2017
 */
public class AccountResponse {
    private Integer id;
    private int parentId;
    private String status;
    private UserResponse userResponse;
    private ContactsResponse contactsResponse;
    private Date dateCreated;


}
