package com.github.srivassumit.protobuf;

import com.example.tutorial.AddressBookProtos.AddressBook;
import com.example.tutorial.AddressBookProtos.Person;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Address Book Main");

        Person.PhoneNumber.Builder phoneNumberBuilder = Person.PhoneNumber.newBuilder();
        phoneNumberBuilder.setType(Person.PhoneType.MOBILE);
        phoneNumberBuilder.setNumber("1234567890");

        Person.Builder personBuilder = Person.newBuilder();

        personBuilder.setName("John").setId(12).setEmail("john.winchester@supernatural.com").addPhones(phoneNumberBuilder.build());

        AddressBook.Builder addressBookBuilder = AddressBook.newBuilder();
        addressBookBuilder.addPeople(personBuilder.build());

        System.out.println(addressBookBuilder.toString());
    }
}
