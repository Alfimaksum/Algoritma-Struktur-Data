package Praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01{
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer(1,"Zaka");
        Customer customer2 = new Customer(5,"Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4,"Cica"));

        customers.add(2, new Customer(100,"Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201,"Della"));
        newCustomers.add(new Customer(202,"Victor"));
        newCustomers.add(new Customer(203,"Sarah"));

        customers.addAll(newCustomers);

        for (Customer cust : customers){
            System.out.println(cust.toString());
        }
        System.out.println(customers);
    }
    
}
