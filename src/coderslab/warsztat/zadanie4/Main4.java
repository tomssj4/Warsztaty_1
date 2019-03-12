package coderslab.warsztat.zadanie4;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class Main4 {

   public static void main(String[] args) {
        String[] dice = getDice().split("D");
        int repeat = getRepeat(dice[0]);
        int[] value = getNumber(dice[1]);
        printThrows(repeat, value[0], value[1]);
    }

    public static String getDice() {
        System.out.print("Podaj kod (np. 2D6+5): ");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d*D(3|4|6|8|10|12|20|100)([-+](\\d+))?");
        while (!scanner.hasNext(pattern)) {
            System.out.print("Wpisano zle dane!");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static int getRepeat(String x) {
        return (x.isEmpty() ? 1 : Integer.parseInt(x));
    }

    public static int[] getNumber(String yz) {
        int index;
        int y, z = 0;
        if (((index = yz.indexOf("+")) < 0)
                && ((index = yz.indexOf("-")) < 0)
        ) {
            y = Integer.parseInt(yz);
        } else {
            y = Integer.parseInt(yz.substring(0, index));
            z = Integer.parseInt(yz.substring(index));
        }
        return new int[]{y, z};
    }

    public static void printThrows(int repeat, int y, int z) {
        int sum = z;
        StringJoiner result = new StringJoiner(" + ");
        for (int i = 0; i < repeat; i++) {
            int num = 1 + (int) (Math.random() * y);
            result.add("" + num);
            sum += num;
        }
        if (z != 0) {
            result.add("(" + z + ")");
        }

        System.out.format("Wynik rzutow + modyfikator: %s = %s", result.toString(), sum);

    }
}
