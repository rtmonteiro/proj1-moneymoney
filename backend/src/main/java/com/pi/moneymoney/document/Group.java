package com.pi.moneymoney.document;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Group {
    
    @Id
    private String id;
    private Timestamp createdAt;
    private String name;
    private String urlImage;
    private Timestamp deletedAt;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrlImage() {
        return urlImage;
    }
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    public Timestamp getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }
}
