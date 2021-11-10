package com.company;

import java.io.*;
import java.util.Scanner;

public class Class4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub


        Employee [] Employees= null;
        FileInputStream fileIn = new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\PJA\\emp.dat");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Employees= (Employee []) in.readObject();
        in.close();
        fileIn.close();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Employee Number");
        int nbr= sc.nextInt();

        for (int i = 0; i < Employees.length; i++) {
            if (Employees[i].number == nbr) {
                System.out.println("The employe Imnformations: \n");
                System.out.println("Name : " + Employees[i].name + "\n" + Employees[i].address + "\n" + Employees[i].SSN + "\n" + Employees[i].number + "\n");
            }
        }

    }

}