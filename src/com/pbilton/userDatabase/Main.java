package com.pbilton.userDatabase;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> customerName = new ArrayList<>();
        ArrayList<String> customerEmail = new ArrayList<>();
        ArrayList<String> customerCompany = new ArrayList<>();

        newUser user1 = new newUser();
        customerName.add(user1.getUserName());
        customerEmail.add(user1.getUserEmail());
        customerCompany.add(user1.getUserCompany());

        newUser user2 = new newUser();
        customerName.add(user2.getUserName());
        customerEmail.add(user2.getUserEmail());
        customerCompany.add(user2.getUserCompany());

        System.out.println(customerName.get(0) +" " + customerEmail.get(0) + " " + customerCompany.get(0));
        System.out.println(customerName.get(1) +" " + customerEmail.get(0) + " " + customerCompany.get(1));
    }
}



