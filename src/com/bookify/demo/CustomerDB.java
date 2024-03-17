package com.bookify.demo;

import java.util.ArrayList;

import com.bookify.model.Book;
import com.bookify.model.Customer;

public class CustomerDB {

    private static CustomerDB customerDB;

    private ArrayList<Book> cartItems = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    private CustomerDB() {
        super();
    }

    public static synchronized CustomerDB getInstance() {
        if (customerDB == null) {
            customerDB = new CustomerDB();
        }
        return customerDB;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void addCartItem(Book book) {
        cartItems.add(book);
    }

    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty!");
        }
        for (Book book : cartItems) {
            System.out.println(book.getBookId() + " -> " +book);
        }
    }

    public void removeCartItem(Book book) {
        cartItems.remove(book);
    }

    public void clearCartItems() {
        cartItems.clear();
    }

    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void displayCustomerCart(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                for (Book book : cartItems) {
                    System.out.println(book);
                }
            }
        }
    }
}