package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your id number: ");
        int id = input.nextInt();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();






    }

    public class User {
        int id;
        String name;
        String username;
        String password;



    }

    public class Flight {
        int flightnumber;
        String destination;
        String departure;
    }

}