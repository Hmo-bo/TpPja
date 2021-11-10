package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee[] e;

        try {
            FileInputStream fileIn = new FileInputStream("emp.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee[]) in.readObject();
            in.close();
            //
            RandomAccessFile randomAccessFile = new RandomAccessFile("empdirect.dat", "rw");
            randomAccessFile.write(in.read());
            randomAccessFile.close();
            //
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Tableau Employee non trouvee");
            c.printStackTrace();
            return;
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println("Index : " + i);
            System.out.println("Nom : " + e[i].name);
            System.out.println("Adresse : " + e[i].address);
            System.out.println("SSN : " + e[i].SSN);
            System.out.println("Number : " + e[i].number);
        }
    }
}
