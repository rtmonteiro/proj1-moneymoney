package com.pi.moneymoney.document;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {
    
    @Id
    private String id;
    private String idGroup;
    @CreatedDate
    private Timestamp createdAt;
    private Date transactionDate;
    private double value;
    private String idUser;
    private String currency;
    private Timestamp deletedAt;

    public String getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(String idGroup) {
        this.idGroup = idGroup;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }


}
