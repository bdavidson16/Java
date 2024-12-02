/*Bailey Davidson
 * CS320 Project 1 
 * October 13th, 2024
 * */

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contactMap = new HashMap<>();

    // Add a contact
    public void addContact(Contact contact) {
        if (contactMap.containsKey(contact.getId())) {
            System.out.println("Contact with this ID already exists.");
        } else {
            contactMap.put(contact.getId(), contact);
            System.out.println("Contact added: " + contact);
        }
    }

    // Delete a contact using ID
    public void deleteContact(String id) {
        if (contactMap.remove(id) != null) {
            System.out.println("Contact with ID " + id + " deleted.");
        } else {
            System.out.println("Contact with ID " + id + " not found.");
        }
    }

    // Update contact fields
    public void updateContact(String id, String firstName, String lastName, String number, String address) {
        Contact contact = contactMap.get(id);
        if (contact != null) {
            if (firstName != null) contact.setFirstName(firstName);
            if (lastName != null) contact.setLastName(lastName);
            if (number != null) contact.setNumber(number);
            if (address != null) contact.setAddress(address);
            System.out.println("Contact updated: " + contact);
        } else {
            System.out.println("Contact with ID " + id + " not found.");
        }
    }

    // Display all contacts
    public void displayContacts() {
        if (contactMap.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            contactMap.values().forEach(System.out::println);
        }
    }
}
