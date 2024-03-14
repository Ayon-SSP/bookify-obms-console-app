package com.bookify.model;

public class CustomerAddress implements Comparable<CustomerAddress> {
    private String customerAddressId;
    private Customer customer;
    private String addressType;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String landmark;
    private String phone;

    public CustomerAddress() {
        super();
    }

    public CustomerAddress(String customerAddressId, Customer customer, String addressType, String addressLine1, String addressLine2, String city, String state, String country, String postalCode, String landmark, String phone) {
        this.customerAddressId = customerAddressId;
        this.customer = customer;
        this.addressType = addressType;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.landmark = landmark;
        this.phone = phone;
    }

    public String getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(String customerAddressId) {
        this.customerAddressId = customerAddressId;
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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerAddressId == null) ? 0 : customerAddressId.hashCode());
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
        CustomerAddress other = (CustomerAddress) obj;
        if (customerAddressId != other.customerAddressId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CustomerAddress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", addressType=" + addressType
                + ", city=" + city + ", country=" + country + ", customer=" + customer + ", customerAddressId=" + customerAddressId
                + ", landmark=" + landmark + ", phone=" + phone + ", postalCode=" + postalCode + ", state=" + state + "]";
    }

    // TODO: Implement the compareTo method for multiple primary keys
    @Override
    public int compareTo(CustomerAddress o) {
        return Integer.parseInt(this.customerAddressId.substring(2)) - Integer.parseInt(o.customerAddressId.substring(2));
    }
}