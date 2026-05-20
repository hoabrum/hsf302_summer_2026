package com.jpademo.entity;

import jakarta.persistence.*;

@Entity
public class Husband {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "husband_id")
    private int id;

    private String name;

    @OneToOne(mappedBy = "husband")
    private Wife wife;

    public Husband() {}

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
