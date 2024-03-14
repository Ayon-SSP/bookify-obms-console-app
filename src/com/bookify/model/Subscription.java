package com.bookify.model;

public class Subscription implements Comparable<Subscription> {
    private String subscriptionStatusId;
    private String subscriptionName;
    private String subscriptionDescription;
    private double subscriptionPrice;
    private int subscriptionDuration;
    private double subscriptionDiscountOnOrder;

    public Subscription() {
        super();
    }

    public Subscription(String subscriptionStatusId, String subscriptionName, String subscriptionDescription, double subscriptionPrice, int subscriptionDuration, double subscriptionDiscountOnOrder) {
        this.subscriptionStatusId = subscriptionStatusId;
        this.subscriptionName = subscriptionName;
        this.subscriptionDescription = subscriptionDescription;
        this.subscriptionPrice = subscriptionPrice;
        this.subscriptionDuration = subscriptionDuration;
        this.subscriptionDiscountOnOrder = subscriptionDiscountOnOrder;
    }

    public String getSubscriptionStatusId() {
        return subscriptionStatusId;
    }

    public void setSubscriptionStatusId(String subscriptionStatusId) {
        this.subscriptionStatusId = subscriptionStatusId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getSubscriptionDescription() {
        return subscriptionDescription;
    }

    public void setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public int getSubscriptionDuration() {
        return subscriptionDuration;
    }

    public void setSubscriptionDuration(int subscriptionDuration) {
        this.subscriptionDuration = subscriptionDuration;
    }

    public double getSubscriptionDiscountOnOrder() {
        return subscriptionDiscountOnOrder;
    }

    public void setSubscriptionDiscountOnOrder(double subscriptionDiscountOnOrder) {
        this.subscriptionDiscountOnOrder = subscriptionDiscountOnOrder;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((subscriptionStatusId == null) ? 0 : subscriptionStatusId.hashCode());
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
        Subscription other = (Subscription) obj;
        if (subscriptionStatusId != other.subscriptionStatusId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Subscription [subscriptionDescription=" + subscriptionDescription + ", subscriptionDiscountOnOrder="
                + subscriptionDiscountOnOrder + ", subscriptionDuration=" + subscriptionDuration + ", subscriptionName="
                + subscriptionName + ", subscriptionPrice=" + subscriptionPrice + ", subscriptionStatusId=" + subscriptionStatusId
                + "]";
    }

    @Override
    public int compareTo(Subscription o) {
        return Integer.parseInt(this.subscriptionStatusId.substring(2)) - Integer.parseInt(o.subscriptionStatusId.substring(2));
    }
}