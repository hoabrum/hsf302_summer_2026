package com.springboot.dto;

import java.time.LocalDateTime;

public class CustomerDTO {

    private int id;
    private String firstName;
    private String comment;
    private LocalDateTime orderDate;

    public CustomerDTO() {
    }

    public CustomerDTO(int id, String firstName, String comment, LocalDateTime orderDate) {
        this.id = id;
        this.firstName = firstName;
        this.comment = comment;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", comment='" + comment + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
