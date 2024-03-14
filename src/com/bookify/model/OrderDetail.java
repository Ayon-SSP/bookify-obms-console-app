package com.bookify.model;

public class OrderDetail implements Comparable<OrderDetail> {
    private String orderDetailId;
    private String orderId;
    private String bookId;
    private int quantity;
    private double price;
    private double discount;
    private double tax;
    private double shipping;
    private double grandTotal;

    public OrderDetail() {
        super();
    }

    public OrderDetail(String orderDetailId, String orderId, String bookId, int quantity, double price, double discount, double tax,
            double shipping, double grandTotal) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.tax = tax;
        this.shipping = shipping;
        this.grandTotal = grandTotal;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderDetailId == null) ? 0 : orderDetailId.hashCode());
        return result;
    } // notGoodPractice?

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderDetail other = (OrderDetail) obj;
        if (orderDetailId != other.orderDetailId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OrderDetail [bookId=" + bookId + ", grandTotal=" + grandTotal + ", orderDetailId=" + orderDetailId + ", orderId="
                + orderId + ", price=" + price + ", quantity=" + quantity + ", shipping=" + shipping + ", tax=" + tax
                + ", discount=" + discount + "]";
    }

    @Override
    public int compareTo(OrderDetail o) {
        return Integer.parseInt(this.orderDetailId.substring(2)) - Integer.parseInt(o.orderDetailId.substring(2));
    }
}