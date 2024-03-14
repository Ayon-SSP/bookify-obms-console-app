package com.bookify.model;

import java.sql.Date;

public class UserReview implements Comparable<UserReview> {
    private Book book;
    private Customer customer;
    private double bookRating;
    private String bookReview;
    private Date reviewDate;

    public UserReview() {
        super();
    }

    public UserReview(Book book, Customer customer, double bookRating, String bookReview, Date reviewDate) {
        this.book = book;
        this.customer = customer;
        this.bookRating = bookRating;
        this.bookReview = bookReview;
        this.reviewDate = reviewDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBookRating() {
        return bookRating;
    }

    public void setBookRating(double bookRating) {
        this.bookRating = bookRating;
    }

    public String getBookReview() {
        return bookReview;
    }

    public void setBookReview(String bookReview) {
        this.bookReview = bookReview;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
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
        UserReview other = (UserReview) obj;
        if (book != other.book)
            return false;
        if (customer != other.customer)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserReview [book=" + book + ", bookRating=" + bookRating + ", bookReview=" + bookReview + ", customer=" + customer
                + ", reviewDate=" + reviewDate + "]";
    }

    @Override
    public int compareTo(UserReview o) {
        return Integer.parseInt(this.book.getBookId().substring(2)) - Integer.parseInt(o.book.getBookId().substring(2));
    }
}