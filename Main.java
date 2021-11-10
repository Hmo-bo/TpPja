package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insérer le number de employeurs");
        int nbr = scanner.nextInt();
        Employee[] e = new Employee[nbr];

        for (int i = 0; i < nbr; i++) {
            Employee employee = new Employee();
            System.out.println("Insérer le nom du employeur" + i);
            employee.name = scanner.next();
            System.out.println("Insérer l'address du employeur" + i);
            employee.address = scanner.next();
            System.out.println("Insérer le SSN du employeur" + i);
            employee.SSN = scanner.nextInt();
            System.out.println("Insérer le number du employeur" + i);
            employee.number = scanner.nextInt();
            //
            e[i] = employee;
        }
        
        try {
            FileOutputStream fileOut = new FileOutputStream("emp.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("donnees serialisees sauvegardees dans employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
