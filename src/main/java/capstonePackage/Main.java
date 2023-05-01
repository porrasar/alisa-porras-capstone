package src.main.java.capstonePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {//class beg

    public static void main(String[] args) {//main beg


        //----------------------------------CREATE OBJECT---------------------------------------

        Scanner scannerInput = new Scanner(System.in);
        Reservations reservations = new Reservations();
        Payments payments = new Payments();
        Customer customer = new Customer();
        //DupCustomerArray dupCustomerArray = new DupCustomerArray();
        Department department = new Department();


        //---------------------------------BUSINESS LOGIC --------------------------------------

        Customer currentCustomer1 = new currentCustomer(33333, "Toby James",
                "8745 Too Little", "555-222-9858",
                true);
//        true, false, true, true);
        Customer currentCustomer2 = new currentCustomer(1111, "Lynn Odd",
                "8999 Big Cow", "882-282-9825",
                true);
//        true, true, true, true);
        Customer potentialCustomer1 = new potentialCustomer(44444, "Kanesha Washington",
                "52 Not Now Ave", "748-227-9645",
                true);
//                true, true, "225 Stone St");
        Customer potentialCustomer2 = new potentialCustomer(5555, "Tommy Ham",
                "52552 ok dr ", "945-227-8888",
                true);
//        true, false, "235 Edge St");


        //ADD new customer
        department.addCustomer(currentCustomer1);
        department.addCustomer(currentCustomer2);
        department.addCustomer(potentialCustomer1);
        department.addCustomer(potentialCustomer2);


        //using scanner to get user input
        System.out.println("Enter your name:");
        String name = scannerInput.next();
        System.out.println(name + ",  please enter what you would like to do:");
        System.out.println(" ");

        System.out.println("1. Add a customer");
        System.out.println("2. Get existing customer");
        System.out.println("3. Get ALL customers");
        System.out.println("4. Update a customer");
        System.out.println("5. Delete a customer");

        String chosenOption = scannerInput.next();
        System.out.println("CHOSEN OPTION:   " + chosenOption);


        // ADD a customer
        if (chosenOption.equals("1")) {
            System.out.println("ADDED A NEW CUSTOMERS");
            System.out.println("not working yet");
//            System.out.println(name + ",  please enter information you "
//                    + "would like to add: \n " +
//                    "in this format: " +
//                    "33333, \"Toby James\",\"8745 Too Little\", \"555-222-9858\",\n" +
//                    " true, false, true, true);");
//
//            //45454,"tom boy","8745 yeah","888-777-9999",false,true,true,true
//            String customerInput = scannerInput.next();
//            department.addCustomer(customer);
            System.out.println(" ");


            // get a specific EXISTING customer
        } else if (chosenOption.equals("2")) {
            System.out.println("GET A SPECIFIC EXISTING CUSTOMER");
            System.out.println(name + ",  please enter the customer id "
                    + "you would like to attain: ");
            int customerId = scannerInput.nextInt();
            ArrayList<Customer> customerGetSpecificArrayList
                    = department.getASpecificCustomerArray(customerId);
            System.out.println(" ");


            // get ALL existing customer
        } else if (chosenOption.equals("3")) {
            System.out.println("they chose option 3 to get all customers");
            System.out.println("GET ALL CUSTOMER");
            ArrayList<Customer> customerArrayList
                    = department.getCustomerArray();
            System.out.println(" ");


            // UPDATE a specific existing customer
        } else if (chosenOption.equals("4")) {
            System.out.println("they chose option 4 to update existing customer");
            System.out.println("not working yet");

            System.out.println(name + ",  please enter the customer id "
                    + "you would like to update: ");
            int customerId = scannerInput.nextInt();

            System.out.println(name + ",  please enter the field you would "
                    + "like to update (name or address: ");
            String customerField = scannerInput.next();

            System.out.println(name + ",  please enter the new info:   ");
            String newInfoToUpdateField = scannerInput.next();

//            ArrayList<Customer> customerGetSpecificArrayList
//                    = department.getASpecificCustomerArray(customerId);
//            System.out.println("UPDATE A SPECIFIC EXISTING CUSTOMER");
//            System.out.println(name + ",  please enter what you would like to change: ");
//
//            String updateAddress = scannerInput.next();
//            ArrayList<Customer> updateSpecifCustomerArray
//                    = department.updateSpecifCustomerArray
//                    (potentialCustomer1, updateAddress);

//             ArrayList<Customer> updateSpecifCustomerArray
            department.updateSpecifCustomerArray
                    (customerId, customerField, newInfoToUpdateField);
            System.out.println("  ");


            // DELETE a specific existing customer
        } else if (chosenOption.equals("5")) {
            System.out.println("they chose option 5 to delete");
            System.out.println("DELETE A SPECIFIC EXISTING CUSTOMER");
            System.out.println(name + ",  please enter the customer id to delete: ");
            int customerId = scannerInput.nextInt();
            //ArrayList<Customer> deleteSpecificCustomerArray =
            department.deleteSpecificCustomerArray(customerId);
            //customerArrayList = department.getCustomerArray();

        }


    }//main end

}//class end
