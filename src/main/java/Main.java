package src.main.java;

import java.util.ArrayList;

public class Main {//class beg

    public static void main(String[] args) {//main beg


        //----------------------------------CREATE OBJECT---------------------------------------

        Reservations reservations = new Reservations();
        Payments payments = new Payments();
        Customer customer = new Customer();
        Department department = new Department();


        //---------------------------------BUSINESS LOGIC --------------------------------------

        Customer currentCustomer1 = new currentCustomer(33333, "Toby James",
                "8745 Too Little", "555-222-9858",
                true, false, true, true);
        Customer currentCustomer2 = new currentCustomer(1111, "Lynn Odd",
                "8999 Big Cow", "882-282-9825",
                true, true, true, true);
        Customer potentialCustomer1 = new potentialCustomer(44444, "Kanesha Washington",
                "52 Not Now Ave", "748-227-9645",
                true, true, "225 Stone St");
        Customer potentialCustomer2 = new potentialCustomer(5555, "Tommy Ham",
                "52552 ok dr ", "945-227-8888",
                true, false, "235 Edge St");


        //ADD new customer

        department.addCustomer(currentCustomer1);
        department.addCustomer(currentCustomer2);
        department.addCustomer(potentialCustomer1);
        department.addCustomer(potentialCustomer2);
        System.out.println("ADDED A NEW CUSTOMERS");
        System.out.println(" ");


        // get a specific EXISTING customer
        System.out.println("GET A SPECIFIC EXISTING CUSTOMER");
        ArrayList<Customer> customerGetSpecificArrayList
                = department.getASpecificCustomerArray(currentCustomer2);
        System.out.println(" ");


        // get ALL existing customer
        System.out.println("GET ALL CUSTOMER");
        ArrayList<Customer> customerArrayList
                = department.getCustomerArray();
        System.out.println(" ");

        // UPDATE a specific existing customer
        String updateAddress = "488 hi there Blvd";
        System.out.println("UPDATE A SPECIFIC EXISTING CUSTOMER");
        ArrayList<Customer> updateSpecifCustomerArray
                = department.updateSpecifCustomerArray
                (potentialCustomer1, updateAddress);
        System.out.println(" ");

        // DELETE a specific existing customer
        System.out.println("DELETE A SPECIFIC EXISTING CUSTOMER");
        ArrayList<Customer> deleteSpecificCustomerArray
                = department.deleteSpecificCustomerArray(potentialCustomer2);
        customerArrayList = department.getCustomerArray();


    }//main end

}//class end
