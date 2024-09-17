package com.CO2Project;
import java.util.Comparator;

public class CustomerBalanceComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return Double.compare(c1.getBalance(), c2.getBalance());
    }
}
