/*Bailey Davidson
 * CS320 Project 1 
 * October 13th, 2024
 * */

public class ContactClass {

private String firstName;
private String lastName;
private String Number;
private String Address;
private String contactID;

public ContactClass(String firstName, String lastName, String Number, String Address) {
	if(firstName == null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid first name");
	}

	if(lastName == null || lastName.length()>10) {
		throw new IllegalArgumentException("Invalid last name");
	}

	if(Number == null || Number.length()>10 || Number.length()<10) {
		throw new IllegalArgumentException("Invalid number");
	}

	if(Address == null || Address.length()>30) {
		throw new IllegalArgumentException("Invalid address");
	}

	if(contactID == null || contactID.length()>10) {
		throw new IllegalArgumentException("Invalid contact ID");
	}

	this.firstName = firstName;
	this.lastName = lastName;
	this.Number = Number;
	this.Address = Address;
	this.contactID = contactID;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getNumber() {
	return Number;
}

public String getAddress() {
	return Address;
}

public String getContactId() {
	return contactID;
}

@Override
public String toString() {
    return "Contact{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", number='" + number + '\'' +
            ", address='" + address + '\'' +
            '}';
}
}
