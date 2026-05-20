package com.jpademo.entity;

import jakarta.persistence.*;

@Entity
public class Wife {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wife_id")
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "husband_id", referencedColumnName = "husband_id", unique = true)
    private Husband husband;

    public Wife() {
    }

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
