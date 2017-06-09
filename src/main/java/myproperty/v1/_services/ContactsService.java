/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import myproperty.v1._dao.ContactsDAOImpl;
import myproperty.v1._entities.Contacts;
import myproperty.v1._entities.responses.ContactsResponse;
import myproperty.v1._entities.responses.UserResponse;
import myproperty.v1.helper.ParentTypes;
import myproperty.v1.helper.StatusEnum;
import static myproperty.v1.helper.utilities.getCurrentDate;
import org.springframework.stereotype.Service;

/**
 *
 * @author mover 6/9/2917
 */
@Service
public class ContactsService {

    private final ContactsDAOImpl contactsDAOImpl = ContactsDAOImpl.getInstance();

    //TODO: Fetch all  Users
    public Collection<ContactsResponse> getAllContacts() {

        Collection<Contacts> contactses = contactsDAOImpl.findEntities();

        Collection<ContactsResponse> contactsResponse = new ArrayList<>();
        //java 8 functional statement
        contactses.forEach((Contacts contacts) -> {
            contactsResponse.add(ContactsResponse(contacts));
        });

        return contactsResponse;
    }

    //TODO: FEtch all Contactses
    /*
     *  Based on Parent type and Parent Id:
     */
    public Collection<ContactsResponse> getAllContacts(ParentTypes parentTypes, Integer parent_id) throws Exception {

        Collection<Contacts> addresses = contactsDAOImpl.findContactses(parent_id, parentTypes.toString());

        Collection<ContactsResponse> contactsResponse = new ArrayList<>();
        //java 8 functional statement
        addresses.forEach((Contacts address) -> {
            contactsResponse.add(ContactsResponse(address));
        });

        return contactsResponse;
    }

    //TODO :  get Contacts by Id
    public ContactsResponse getContactById(Integer id) throws Exception {
        Contacts address = contactsDAOImpl.findContacts(id);
        return ContactsResponse(address);
    }

    //TODO : get Contacts by User iD
    public Collection<ContactsResponse> getContactsByUserId(Integer userId) throws Exception {

        Collection<Contacts> addresses = contactsDAOImpl.findContactsesByUserId(userId);

        Collection<ContactsResponse> contactsResponse = new ArrayList<>();
        //java 8 functional statement
        addresses.forEach((Contacts address) -> {
            contactsResponse.add(ContactsResponse(address));
        });
        return contactsResponse;

    }

    //TODO: update Contacts
    public ContactsResponse updateContacts(Integer contaId, Contacts contacts) throws Exception {

        contacts.setId(contaId);
        Contacts _Contacts = contactsDAOImpl.findContacts(contaId);

        if (contacts.getDetails() != null) {
            _Contacts.setDetails(contacts.getDetails());
        }

        if (contacts.getType() != null) {
            _Contacts.setType(contacts.getType());
        }


        if (contacts.getUpdatedBy() != null) {
            _Contacts.setUpdatedBy(contacts.getUpdatedBy());
            Date dateUpdate = getCurrentDate();
            _Contacts.setDateUpdated(dateUpdate);
        }

        Contacts _contacts = contactsDAOImpl.edit(_Contacts);
        return ContactsResponse(_contacts);
    }

    //TODO: Create Contacts
    public ContactsResponse createContacts(Contacts contacts, ParentTypes parentTypes, Integer parent_id) throws Exception {
        contacts.setDateCreated(getCurrentDate());
        if (contacts.getStatus() == null) {
            contacts.setStatus(StatusEnum.ACTIVE.toString());
        }
        contacts.setParentType(parentTypes.toString());
        contacts.setParentId(parent_id);

        return ContactsResponse(contactsDAOImpl.create(contacts));

    }

    //TODO: Contacts  Response
    public ContactsResponse ContactsResponse(Contacts contacts) {

        ContactsResponse contactsResponse = new ContactsResponse();
        if (contacts == null) {
            return contactsResponse;
        }

        contactsResponse.setId(contacts.getId());

        contactsResponse.setDetails(contacts.getDetails());


        // User Details
        if (contacts.getCreatedBy() != null) {
            UserResponse _user = new UserResponse();

            _user.setUsername(contacts.getCreatedBy().getUsername());
            _user.setId(contacts.getCreatedBy().getId());
            _user.setDateCreated(contacts.getCreatedBy().getDateCreated());
            contactsResponse.setCreatedBy(_user);
        }
        //Created Information
        contactsResponse.setDateCreated(contacts.getDateCreated());

        //Updated Information
        contactsResponse.setDateUpdated(contacts.getDateUpdated());

        if (contacts.getUpdatedBy() != null) {
            UserResponse _updatedBy = new UserResponse();
            _updatedBy.setUsername(contacts.getUpdatedBy().getUsername());
            _updatedBy.setId(contacts.getUpdatedBy().getId());
            _updatedBy.setDateCreated(contacts.getUpdatedBy().getDateCreated());
            contactsResponse.setUpdatedBy(_updatedBy);
        }

        contactsResponse.setStatus(contacts.getStatus());
        contactsResponse.setParent_id(contacts.getParentId());
        contactsResponse.setParent_type(contacts.getParentType());

        return contactsResponse;

    }

}
