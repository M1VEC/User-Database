package com.pbilton.userDatabase;

public class user {
    private String name;
    private String email;
    private String company;
    private int id;
    private static int nextId = 1;

    public static user create(String name, String email, String company) {
        return new user(nextId++, name, email, company);
    }

    public user(int id, String name, String email, String company) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
    }

    public String print() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email + ", Company: " + company;
    }
}

