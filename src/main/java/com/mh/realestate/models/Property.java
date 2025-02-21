package com.mh.realestate.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "properties")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description = "";
    private double price;
    private int bathrooms;
    private double sq_meters;
    private String address = "";
    private boolean status;
    private byte[] photo;
    private String photo_name = "";

    public Property() {
    }

    public Property(String description, double price, int bathrooms, double sq_meters, String address, boolean status, byte[] photo, String photo_name) {
        this.description = description;
        this.price = price;
        this.bathrooms = bathrooms;
        this.sq_meters = sq_meters;
        this.address = address;
        this.status = status;
        this.photo = photo;
        this.photo_name = photo_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getSq_meters() {
        return sq_meters;
    }

    public void setSq_meters(double sq_meters) {
        this.sq_meters = sq_meters;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPhoto_name() {
        return photo_name;
    }

    public void setPhoto_name(String photo_name) {
        this.photo_name = photo_name;
    }
}
