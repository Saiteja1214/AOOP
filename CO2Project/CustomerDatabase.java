package com.CO2Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerDatabase implements Iterable<Customer> {
    private List<Customer> customers;
    public CustomerDatabase() {
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void sortByName() {
        Collections.sort(customers);
    }
    public void sortByBalance() {
        Collections.sort(customers, new CustomerBalanceComparator());
    }

    @Override
    public Iterator<Customer> iterator() {
        return customers.iterator();
    }
    public CustomerDatabase cloneDatabase() throws CloneNotSupportedException {
        CustomerDatabase clonedDatabase = new CustomerDatabase();
        for (Customer customer : customers) {
            clonedDatabase.addCustomer(customer.clone());
        }
        return clonedDatabase;
    }
    private void addCustomer1(Customer clone) {
		// TODO Auto-generated method stub
		
	}
    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
