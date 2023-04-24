package src.main.java;

import java.util.ArrayList;

public class Department
{
    //---------------------------------------------VARIABLE---------------------------------

    private String department;
    private String departmentLocation;

    private ArrayList<Customer> customerArray = new ArrayList<>();
    //---------------------------------------------CONSTRUCTORS-------------------------------------------


    public Department() {
    }

    public Department(String department, String departmentLocation) {
        this.department = department;
        this.departmentLocation = departmentLocation;
    }

    public Department(String department, String departmentLocation,
                      ArrayList<Customer> customerArray) {
        this.department = department;
        this.departmentLocation = departmentLocation;
        this.customerArray = customerArray;
    }
//---------------------------------------------BUSINESS LOGIC/METHODS-----------------------

    //add new customer
    public void addCustomer(Customer customer)
    {
        customerArray.add(customer);
    }


    // get a specific existing customer
    public ArrayList<Customer> getASpecificCustomerArray(Customer customer)
    {
        for (int i = 0; i < customerArray.size(); i++)
        {
            if (customer.getCustomerId() == customerArray.get(i).getCustomerId())
            {
                System.out.println(customerArray.get(i).getCustomerInfo());
            }
        }
        return customerArray;
    }

    // get ALL existing customer
    public ArrayList<Customer> getCustomerArray()
    {
        for (int i = 0; i < customerArray.size(); i++)
        {
            System.out.println("customer info: "
             + customerArray.get(i).getCustomerInfo());
        }
        return customerArray;
    }


    // update existing customer
    public ArrayList<Customer> updateSpecifCustomerArray(Customer customer, String phone)
    {
//        for (int i = 0; i < customerArray.size(); i++)
//        {
//            if (customer.getCustomerId() == customerArray.get(i).getCustomerId())
//            {
//                customerArray.set(customer.setCustomerPhone("777-777-7777"));
//                System.out.println(customerArray.get(i).getCustomerInfo());
//            }
//        }
        return customerArray;
    }



    // delete existing customer
    public ArrayList<Customer> deleteSpecificCustomerArray(Customer customer)
    {
        for (int i = 0; i < customerArray.size(); i++)
        {
            if (customer.getCustomerId() == customerArray.get(i).getCustomerId())
            {
                customerArray.remove(customer);
             }
        }
        return customerArray;
    }




    //---------------------------------------------GETTER/SETTER-----------------------------------------

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentLocation()
    {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation)
    {
        this.departmentLocation = departmentLocation;
    }



    public void setCustomerArray(ArrayList<Customer> customerArray)
    {
        this.customerArray = customerArray;
    }
}
