package com.Blz.assignment;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        String firstName, lastName, address, state, city,pinCode, phoneNumber, email;
        Contact[] n = new Contact[4];
        Scanner input = new Scanner(System.in);
        int i;
        for (i=1;i<4;i++) {
            n[i] = new Contact();

            System.out.println("Enter details of Contact "+i+"\n");

            System.out.println("Enter the FirstName");
            firstName = input.next();
            n[i].setFirstName(firstName);

            System.out.println("Enter the LastName");
            lastName = input.next();
            n[i].setLastName(lastName);

            System.out.println("Enter the Address");
            address = input.next();
            n[i].setAddress(address);

            System.out.println("Enter the state");
            state = input.next();
            n[i].setState(state);

            System.out.println("Enter the city");
            city = input.next();
            n[i].setCity(city);

            System.out.println("Enter the Pincode");
            pinCode = input.next();
            n[i].setZip(pinCode);

            System.out.println("Enter the Phone Number");
            phoneNumber = input.next();
            n[i].setPhoneNumber(phoneNumber);

            System.out.println("Enter the Email");
            email = input.next();
            n[i].setEmail(email);



            System.out.println("\nYour first name is " + n[i].getFirstName());
            System.out.println("Your last name is " + n[i].getLastName());
            System.out.println("Your address  is " + n[i].getAddress());
            System.out.println("Your state is " + n[i].getState());
            System.out.println("Your city is " + n[i].getCity());
            System.out.println("Your zipcode is " + n[i].getZip());
            System.out.println("Your phone number is " + n[i].getPhoneNumber());
            System.out.println("Your email is " + n[i].getEmail());
            System.out.println("\n");
        }


        System.out.println("Enter 1 to  edit\nEnter 2 to delete\nEnter 3 to Print All details");

        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Enter the Batch number");
            int temp = input.nextInt();
            System.out.println("Enter\n 1 to edit FirstName \n 2 to edit LastName\n 3 to edit address\n 4 to edit State \n 5 to edit city \n 6 to edit Zipcode \n 7 to edit Phone Number \n 8 to edit email \n 9 to edit nothing");
            int edit = input.nextInt();
            switch (edit) {
                case 1:
                    System.out.println("Enter New First Name");
                    firstName= input.next();
                    n[temp].setFirstName(firstName);
                    break;
                case 2:
                    System.out.println("Enter new Last Name");
                    lastName = input.next();
                    n[temp].setLastName(lastName);
                    break;
                case 3:
                    System.out.println("Enter new Address");
                    address = input.next();
                    n[temp].setAddress(address);
                    break;
                case 4:
                    System.out.println("Enter the  new State");
                    state = input.next();
                    n[temp].setState(state);
                    break;
                case 5:
                    System.out.println("Enter the new city");
                    city = input.next();
                    n[temp].setCity(city);
                    break;
                case 6:
                    System.out.println("Enter the new pincode");
                    pinCode = input.next();
                    n[temp].setZip(pinCode);
                    break;
                case 7:
                    System.out.println("Enter new phone number");
                    phoneNumber = input.next();
                    n[temp].setPhoneNumber(phoneNumber);
                    break;
                case 8:
                    System.out.println("Enter new email");
                    email = input.next();
                    n[temp].setEmail(email);
                    break;

                case 9:
                    System.out.println("\nFollowiwng are the details of the contact \n");
                    break;

                default:
                    System.out.println("Enter the correct number");
                    break;

            }
            for (int j=1;j<4;j++) {
                System.out.println("details of Contact "+j+"\n");
                System.out.println("Your first name is " + n[j].getFirstName());
                System.out.println("Your last name is " + n[j].getLastName());
                System.out.println("Your address  is " + n[j].getAddress());
                System.out.println("Your state is " + n[j].getState());
                System.out.println("Your city is " + n[j].getCity());
                System.out.println("Your zipcode is " + n[j].getZip());
                System.out.println("Your phone number is " + n[j].getPhoneNumber());
                System.out.println("Your email is " + n[j].getEmail() + "\n");
            }

        } else if (choice == 2) {
            System.out.println("Enter the batch you want to delete ");
            int temp = input.nextInt();
           n[temp]= null;
                System.out.println("\nContact is succesfully deleted!!!" + "\n");
            for (int j=1;j<4;j++) {
                if(j!=temp) {
                    System.out.println("Details of contact " + j+"\n");
                    System.out.println("Your first name is " + n[j].getFirstName());
                    System.out.println("Your last name is " + n[j].getLastName());
                    System.out.println("Your address  is " + n[j].getAddress());
                    System.out.println("Your state is " + n[j].getState());
                    System.out.println("Your city is " + n[j].getCity());
                    System.out.println("Your zipcode is " + n[j].getZip());
                    System.out.println("Your phone number is " + n[j].getPhoneNumber());
                    System.out.println("Your email is " + n[j].getEmail() + "\n");
                }
            }

            }
        else if (choice == 3){
            for (int j=1;j<4;j++) {
                System.out.println("Details of contact "+j+"\n");
                System.out.println("Your first name is " + n[j].getFirstName());
                System.out.println("Your last name is " + n[j].getLastName());
                System.out.println("Your address  is " + n[j].getAddress());
                System.out.println("Your state is " + n[j].getState());
                System.out.println("Your city is " + n[j].getCity());
                System.out.println("Your zipcode is " + n[j].getZip());
                System.out.println("Your phone number is " + n[j].getPhoneNumber());
                System.out.println("Your email is " + n[j].getEmail() + "\n");
            }

        }


        }


    }

