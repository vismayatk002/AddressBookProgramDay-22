package com.addressbookprogramday_22;

public class AddressBook{
	
    String firstName, lastName, address, city, state,email;
    long phoneNo;
    int zip;
    public void setDetails(){

        firstName = "Vismaya";
        lastName = "T K";
        address = "House 3";
        city ="Calicut";
        state = "Kerala";
        zip = 564732;
        phoneNo = 987879600;
        email = "vismayatk002@gmail.com";
    }
    public void printDetails(){

        System.out.println("\nFirst Nmae : " + firstName  + "\n\nLast Name : " + lastName + "\n\nAddress : " + address + "\n\nCity : " + city + "\n\nState : " + state + "\n\nZip : " + zip + "\n\nPhone Number : " + phoneNo + "\n\nE-mail : " + email); 
    }
}
