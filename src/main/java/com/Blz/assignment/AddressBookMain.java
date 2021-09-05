package com.Blz.assignment;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Contact n = new Contact();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the FirstName");
        String firstName = input.next();
        n.setFirstName(firstName);

        System.out.println("Enter the LastName");
        String lastName = input.next();
        n.setLastName(lastName);

        System.out.println("Enter the Address");
        String address = input.next();
        n.setAddress(address);

        System.out.println("Enter the city");
        String state = input.next();
        n.setState(state);

        System.out.println("Enter the city");
        String city = input.next();
        n.setCity(city);

        System.out.println("Enter the Pincode");
        String pinCode = input.next();
        n.setZip(pinCode);

        System.out.println("Enter the Phone Number");
        String phoneNumber = input.next();
        n.setPhoneNumber(phoneNumber);

        System.out.println("Enter the Email");
        String email = input.next();
        n.setEmail(email);

        System.out.println(n.getFirstName());
        System.out.println(n.getLastName());
        System.out.println(n.getAddress());
        System.out.println(n.getState());
        System.out.println(n.getCity());
        System.out.println(n.getZip());
        System.out.println(n.getPhoneNumber());
        System.out.println(n.getEmail());


        System.out.println("Enter\n 1 to edit FirstName \n 2 to edit LastName\n 3 to edit address\n 4 to edit State \n 5 to edit city \n 6 to edit Zipcode \n 7 to edit Phone Number \n 8 to edit email \n 9 to edit nothing");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter New First Name");
                firstName = input.next();
                n.setFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter new Last Name");
                lastName = input.next();
                n.setLastName(lastName);
                break;
            case 3:
                System.out.println("Enter new Address");
                address = input.next();
                n.setAddress(address);
                break;
            case 4:
                System.out.println("Enter the  new State");
                state = input.next();
                n.setState(state);
                break;
            case 5:
                System.out.println("Enter the new city");
                city = input.next();
                n.setCity(city);
                break;
            case 6 :
                System.out.println("Enter the new pincode");
                pinCode = input.next();
                n.setZip(pinCode);
                break;
            case 7:
                System.out.println("Enter new phone number");
                phoneNumber= input.next();
                n.setPhoneNumber(phoneNumber);
                break;
            case 8:
                System.out.println("Enter new email");
                email=input.next();
                n.setEmail(email);
                break;

            case 9:
                System.out.println("\nFollowiwng are the details of the contact \n");
                    break;

            default:
                System.out.println("Enter the correct number");
                break;

        }
        System.out.println(n.getFirstName());
        System.out.println(n.getLastName());
        System.out.println(n.getAddress());
        System.out.println(n.getState());
        System.out.println(n.getCity());
        System.out.println(n.getZip());
        System.out.println(n.getPhoneNumber());
        System.out.println(n.getEmail());



    }

}
