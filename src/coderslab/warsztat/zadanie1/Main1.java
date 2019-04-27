package coderslab.warsztat.zadanie1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt((101-1)+1);
        System.out.println(randomNumber);
        int myNumber = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Podaj liczbe: ");
                myNumber = scan.nextInt();
                if (myNumber > randomNumber) {
                    System.out.println("Za duzo.");
                } else if (myNumber < randomNumber){
                    System.out.println("Za malo.");
                } else {
                    System.out.println("Zgadles!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbe!");
                e.printStackTrace();

            }


            } while (myNumber != randomNumber);

    }
}
