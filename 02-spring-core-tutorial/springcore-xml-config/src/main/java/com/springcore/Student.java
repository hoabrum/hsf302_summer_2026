package com.springcore;

public class Student {

    private int id;
    private String fullName;
    private int age;

    private Laptop laptop;

    private Laptop macPro;

    public Student() {

    }

    public Student(Laptop macPro) {
        this.macPro = macPro;
    }

    public Laptop getMacPro() {
        return macPro;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", laptop=" + laptop +
                ", macPro=" + macPro +
                '}';
    }
}
