package com.iyzipay.model.subscription.resource;

import com.iyzipay.model.subscription.enumtype.SubscriptionPaymentStatus;

import java.util.Date;

public class SubscriptionOrderPaymentAttemptData {

    private String conversationId;
    private Date createdDate;
    private Long paymentId;
    private SubscriptionPaymentStatus paymentStatus;
    private String errorCode;
    private String errorMessage;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public SubscriptionPaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(SubscriptionPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
