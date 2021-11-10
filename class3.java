Aissawi 2, [10.11.21 23:52]
package tp1;

import java.io.*;
import java.util.Scanner;

public class Class4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub


        Employee [] Empls = null;
        FileInputStream fileIn = new FileInputStream("C:\\Users\\Life Book\\IdeaProjects\\PJA\\emp.dat");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Empls = (Employee []) in.readObject();
        in.close();
        fileIn.close();


        String err = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Svp Tappez le numero de l'Employe :");
        int nmbrEmp = sc.nextInt();

        for (int i = 0; i < Empls.length; i++) {
            if (Empls[i].number == nmbrEmp) {
                System.out.println("Les informations de l'employe: \n");
                System.out.println("Name : " + Empls[i].name + "\n" + Empls[i].address + "\n" + Empls[i].SSN + "\n" + Empls[i].number + "\n");
            }else{
                err = "Le numero n'exist pas";
            }
        }
        System.out.println(err);

    }

}