package coderslab.warsztat.zadanie3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("Pomysl liczbe od 0 do 1000, a ja ja zgadne w max. 10 probach");
        int min = 0, max = 1001;
        int guess = 0;
        String yes = "tak";
        String no = "nie";
        Scanner scan = new Scanner(System.in);
        int index = 0;
        do {
            guess = ((max - min) / 2) + min;
            System.out.println("Zgaduje: " + guess);
            System.out.println("Zgadlem?");
            String answer = scan.nextLine();
            if (answer.equals(no)) {
                System.out.println("Za duzo?");
                String answer1 = scan.nextLine();
                if (answer1.equals(no)) {
                    System.out.println("Za malo?");
                    String answer2 = scan.nextLine();
                    if (answer2.equals(no)) {
                        System.out.println("Nie oszukuj!");
                    } else if (answer2.equals(yes)) {
                        min = guess;
                        index += 1;
                    }
                } else if (answer1.equals(yes)) {
                    max = guess;
                    index += 1;
                }
            } else if (answer.equals(yes)) {
                System.out.println("Wygrales!");
                break;
            }
        } while (index <= 10);

    }
}
