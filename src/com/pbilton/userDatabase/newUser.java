package com.pbilton.userDatabase;

import java.util.Scanner;

public class newUser {
    private static Scanner scanner = new Scanner(System.in);
    private String userName;
    private String userEmail;
    private String userCompany;


    public newUser() {
        this.userName = getUserInput("username");
        this.userEmail = getUserInput("email");
        this.userCompany = getUserInput("company");

    }

    private String getUserInput(String prompt) {
        System.out.print("Please enter your " + prompt + ":");
        String value = scanner.next();
        return value;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserEmail() { return this.userEmail; }

    public String getUserCompany() {
        return this.userCompany;
    }

}

