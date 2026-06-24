package com.springboot.demo.dto;

public class SigninDTO {

    private String email;
    private String password;
    private String hobbies;
    private String terms;

    public SigninDTO() {

    }

    public SigninDTO(String email, String password, String hobbies, String terms) {
        this.email = email;
        this.password = password;
        this.hobbies = hobbies;
        this.terms = terms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return "SigninDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", terms='" + terms + '\'' +
                '}';
    }
}
