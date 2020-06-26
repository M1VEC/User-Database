package com.pbilton.userDatabase;

public class Main {

    public static void main(String[] args) {
        int userId = 001;

        newUser user1 = new newUser(userId++);
        newUser user2 = new newUser(userId++);

        printFile(user1.getUserName(),user1.getUserEmail(),user1.getUserCompany(),user1.getUserID());
        printFileTwo(user2.getUserName(),user2.getUserEmail(),user2.getUserCompany(),user2.getUserID());
    }

    public static void printFile(String name,String email, String company, int ID) {
        System.out.println("Customer ID: " + ID);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Company: " + company);
    }

    public static void printFileTwo(String name,String email, String company, int ID) {
        System.out.println("Customer ID: " + ID);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Customer Company: " + company);
    }

}



