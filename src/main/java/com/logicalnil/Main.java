package com.logicalnil;

import java.sql.SQLException;
import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println();
        System.out.println("*********** WELCOME TO EMPLOYEE RECORD REGISTRATION ***************");
        EstablishConnection connection = new EstablishConnection();
        connection.getConnection();
        connection.prepare();
        Scanner scanner = new Scanner(System.in);
        int id;
        String name, email, addAnother = "yes";
        boolean isEmployee;


        while (addAnother.equals("yes")){
            System.out.print("\nEnter id :");
            id = scanner.nextInt();
            System.out.print("\nEnter Name :");
            name = scanner.next();
            System.out.print("\nEnter email :");
            email = scanner.next();
            System.out.print("\nAre you permanent employee : (true / false) :");
            isEmployee = scanner.nextBoolean();
            connection.insert(id, name, email, isEmployee);
//            connection.insert(2, "Sarang", "Sarang@sang.com", true);
            System.out.println("Do you want to add one more entry ? : (Yes / No)");
            addAnother = scanner.next().toLowerCase();

        }
        System.out.println("*********** CHECK DB for Details ***************");
        scanner.close();
  }
}