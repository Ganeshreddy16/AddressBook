package com.Blz.assignment;

import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        Contact n = new Contact();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the FirstName");
        String firstName = input.next();
        n.setFirstName(firstName);
        System.out.println(n.getFirstName());

        System.out.println("Enter the LastName");
        String lastName = input.next();
        n.setLastName(lastName);
        System.out.println(n.getLastName());

        System.out.println("Enter the Address");
        String address = input.next();
        n.setAddress(address);
        System.out.println(n.getAddress());

        System.out.println("Enter the city");
        String city = input.next();
        n.setCity(city);
        System.out.println(n.getCity());

        System.out.println("Enter the Pincode");
        String pinCode = input.next();
        n.setZip(pinCode);
        System.out.println(n.getZip());

        System.out.println("Enter the Phone Number");
        String phoneNumber= input.next();
        n.setPhoneNumber(phoneNumber);
        System.out.println(n.getPhoneNumber());

        System.out.println("Enter the Email");
        String email= input.next();
        n.setEmail(email);
        System.out.println(n.getEmail());

    }

}
