package com.bookify.model;

import java.sql.Date;

public class SubscriptionLogHistory implements Comparable<SubscriptionLogHistory> {
    private String subscriptionLogId;
    private Customer customer;
    private Subscription subscription;
    private Date subscriptionStartDate;
    private Date subscriptionEndDate;

    public SubscriptionLogHistory() {
        super();
    }

    public SubscriptionLogHistory(String subscriptionLogId, Customer customer, Subscription subscription, Date subscriptionStartDate, Date subscriptionEndDate) {
        this.subscriptionLogId = subscriptionLogId;
        this.customer = customer;
        this.subscription = subscription;
        this.subscriptionStartDate = subscriptionStartDate;
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public String getSubscriptionLogId() {
        return subscriptionLogId;
    }

    public void setSubscriptionLogId(String subscriptionLogId) {
        this.subscriptionLogId = subscriptionLogId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Date getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(Date subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public Date getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public void setSubscriptionEndDate(Date subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((subscriptionLogId == null) ? 0 : subscriptionLogId.hashCode());
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
        SubscriptionLogHistory other = (SubscriptionLogHistory) obj;
        if (subscriptionLogId != other.subscriptionLogId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SubscriptionLogHistory [customer=" + customer + ", subscription=" + subscription + ", subscriptionEndDate="
                + subscriptionEndDate + ", subscriptionLogId=" + subscriptionLogId + ", subscriptionStartDate=" + subscriptionStartDate
                + "]";
    }

    @Override
    public int compareTo(SubscriptionLogHistory o) {
        return Integer.parseInt(this.subscriptionLogId.substring(2)) - Integer.parseInt(o.subscriptionLogId.substring(2));
    }
}