package com.CO2Project;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
      
        CustomerDatabase customerDatabase = new CustomerDatabase();
        customerDatabase.addCustomer(new Customer("Sai", 100, 50000.75));
        customerDatabase.addCustomer(new Customer("Teja", 101, 300000.00));
        customerDatabase.addCustomer(new Customer("Saiteja", 102, 7000000.50));
        System.out.println("Original Customer List:");
        customerDatabase.displayCustomers();
        customerDatabase.sortByName();
        System.out.println("\nCustomers sorted by Name:");
        customerDatabase.displayCustomers();
        customerDatabase.sortByBalance();
        System.out.println("\nCustomers sorted by Balance:");
        customerDatabase.displayCustomers();
        CustomerDatabase clonedDatabase = customerDatabase.cloneDatabase();
        System.out.println("\nCloned Customer List:");
        clonedDatabase.displayCustomers();
        System.out.println("\nIterating over original customer database:");
        for (Customer customer : customerDatabase) {
            System.out.println(customer);
        }
    }
}
