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

        System.out.println("Hello, please enter what you would like to do:");

        System.out.println("1. Add a customer");
        System.out.println("2. Get existing customer");
        System.out.println("3. Get ALL customers");
        System.out.println("4. Update a customer");
        System.out.println("5. Delete a customer");

        String chosenOption = scannerInput.next();
        System.out.println("CHOSEN OPTION:   " + chosenOption);


        // ADD a customer
        if (chosenOption.equals("1")) {
            System.out.println("ADD A NEW CUSTOMER");
            System.out.println(" ");
            System.out.println("please enter the information you "
                    + "would like to add. There are 5 fields. \n" +
                    "Please enter in this format: please put two spaces" +
                    " between the fields "
                    + " for example: " +
                    "33333,Toby James,8745 Too Little,555-222-9858,true");

            String customerInput = scannerInput.next();
            customerInput += scannerInput.nextLine();
            System.out.println("customer input: " + customerInput);

            Customer currentCustomer3 = new Customer(customerInput);

            System.out.println("ADD STILL NOT WORKING");
            System.out.println("currentcust3: "
                    + (currentCustomer3.toString()));

            //Customer currentCustomer3 = new currentCustomer(customerInput);
            //System.out.println(Arrays.toString(currentCustomer3));
            //ArrayList<Customer> currentCustomer3
            //List<Customer> currentCustomer3
            //        = department.getCustomerArray();
            //System.out.println("new data: "
            department.addCustomer(currentCustomer3);
            System.out.println("Proof record is added: ");
            department.getCustomerArray();
            System.out.println(" ");


            // get a specific EXISTING customer
        } else if (chosenOption.equals("2")) {
            System.out.println("GET A SPECIFIC EXISTING CUSTOMER");
            System.out.println("please enter the customer id "
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


            System.out.println("  please enter the customer id "
                    + "you would like to update: ");
            int customerId = scannerInput.nextInt();

            System.out.println("please enter the field you would "
                    + "like to update (name or address)");

            String customerField = scannerInput.next();

            System.out.print("please enter the new info:   ");

            String newInfoToUpdateField = scannerInput.next();
            newInfoToUpdateField += scannerInput.nextLine();
            department.updateSpecifCustomerArray
                    (customerId, customerField, newInfoToUpdateField);
            System.out.println("  ");


            // DELETE a specific existing customer
        } else if (chosenOption.equals("5")) {
            System.out.println("they chose option 5 to delete");
            System.out.println("DELETE A SPECIFIC EXISTING CUSTOMER");
            System.out.println("please enter the customer id to delete: ");
            int customerId = scannerInput.nextInt();
            department.deleteSpecificCustomerArray(customerId);

        }


    }//main end

}//class end
