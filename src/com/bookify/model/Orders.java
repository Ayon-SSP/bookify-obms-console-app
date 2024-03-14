package com.bookify.model;

import java.sql.Date;
import java.util.ArrayList;

public class Orders implements Comparable<Orders> {
    private String orderId;
    private Customer customer;
    private String addressType;
    private Date orderDate;
    private Date shippedDate;
    private double orderDiscount;
    private double orderTotalCost;
    private String orderStatus;

    // one order contains many orderDetails // notGoodPractice?
    private ArrayList<OrderDetail> orderDetails;

    public Orders() {
        super();
    }

    public Orders(String orderId, Customer customer, String addressType, Date orderDate, Date shippedDate, double orderDiscount, double orderTotalCost, String orderStatus, ArrayList<OrderDetail> orderDetails) {
        this.orderId = orderId;
        this.customer = customer;
        this.addressType = addressType;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.orderDiscount = orderDiscount;
        this.orderTotalCost = orderTotalCost;
        this.orderStatus = orderStatus;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public double getOrderTotalCost() {
        return orderTotalCost;
    }

    public void setOrderTotalCost(double orderTotalCost) {
        this.orderTotalCost = orderTotalCost;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    // order1.orderDetails.add(new OrderDetail(order1, book1, 100, 2));
    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetails.add(orderDetail);
    }

    public void removeOrderDetail(OrderDetail orderDetail) {
        this.orderDetails.remove(orderDetail);
    }

    // ADDED: will get the object of CustomerAddress eg. Home, Office, etc. of a customer
    public CustomerAddress getOrderAddress() {
        return customer.getCustomerAddress(this.addressType);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
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
        Orders other = (Orders) obj;
        if (orderId != other.orderId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Orders [addressType=" + addressType + ", customer=" + customer + ", orderDate=" + orderDate + ", orderId=" + orderId
                + ", orderDiscount=" + orderDiscount + ", orderStatus=" + orderStatus + ", orderTotalCost=" + orderTotalCost
                + ", shippedDate=" + shippedDate + "]";
    }

    @Override
    public int compareTo(Orders o) {
        return Integer.parseInt(this.orderId.substring(2)) - Integer.parseInt(o.orderId.substring(2));
    }
}