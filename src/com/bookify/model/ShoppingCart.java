package com.bookify.model;
/*
 * ⚠️ Not in use
 */
public class ShoppingCart implements Comparable<ShoppingCart>{
    private Customer customer;
    private Book book;
    private int quantity;

    public ShoppingCart() {
        super();
    }

    public ShoppingCart(Customer customer, Book book, int quantity) {
        this.customer = customer;
        this.book = book;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ShoppingCart other = (ShoppingCart) obj;
        if (customer != other.customer)
            return false;
        if (book != other.book)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ShoppingCart [book=" + book + ", customer=" + customer + ", quantity=" + quantity + "]";
    }

    @Override
    public int compareTo(ShoppingCart o) {
        return Integer.parseInt(this.customer.getCustomerId().substring(2)) - Integer.parseInt(o.customer.getCustomerId().substring(2));
    }
}