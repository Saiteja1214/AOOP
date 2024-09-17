package com.CO2Project;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Cloneable {
    private String name;
    private int accountNumber;
    private double balance;

    public Customer(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }
    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        	return true;
        if (o == null || getClass() != o.getClass())
        	return false;
        Customer customer = (Customer) o;
        return accountNumber == customer.accountNumber &&
               Double.compare(customer.balance, balance) == 0 &&
               Objects.equals(name, customer.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, accountNumber, balance);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', accountNumber=" + accountNumber + ", balance=" + balance + "}";
    }
}
