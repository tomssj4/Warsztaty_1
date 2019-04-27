package coderslab.warsztat.zadanie2;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> playerNumbers = new ArrayList(6);
        int number = 0;
        int index = 0;
        do {
            try {
                System.out.print("Podaj liczbe: ");
                number = scan.nextInt();
                if ((number >= 1) && (number <= 49) && !playerNumbers.contains(number)) {
                    playerNumbers.add(number);
                    index += 1;
                } else {
                    System.out.println("Podales zla lub ta sama liczbe.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbe!");
                e.printStackTrace();
            }

        } while (index < 6) ;
        Collections.sort(playerNumbers);
        System.out.println(playerNumbers);
        int [] tab = (tabWithNumbers());
        System.out.println(Arrays.toString(tab));
        int hits = 0;
        for (int j = 0; j < tab.length; j++) {
            if (playerNumbers.contains(tab[j])){
                hits += 1;
            }
        }
        if (hits >= 3){
            System.out.println("Trafiles " + hits);
        } else {
            System.out.println("Nic nie trafiles.");
        }


    }
    static int randomNumbers(){
        Random r = new Random();
        return r.nextInt((49+1)-1);
    }

    static int[] tabWithNumbers(){
        int[] tab = new int[6];
        for (int i =0; i < tab.length; i++){
            tab[i] = randomNumbers();

        } return tab;
    }
}
