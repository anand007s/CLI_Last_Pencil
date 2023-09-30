package lastpencil;

import java.util.Scanner;
import java.util.WeakHashMap;

public class LastPencil {

    public static int NoOfPencil;
    public static String playerFirst;
    public static String playerSecond;

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pencils would you like to use:");
        NoOfPencil = scanner.nextInt();

        System.out.println("Who will be the first (John,Jack):");
        playerFirst = scanner.next();

        playerSecond = playerFirst.equals("John") ? "Jack" : "John";

        playGame();

    }

    public static void printRemainingPencils(int counter) {
        for (int i=0; i<NoOfPencil; i++) {
            System.out.print("|");
        }
        System.out.println();
        String currentPlayer;
        if (counter % 2 != 0) {
            currentPlayer = playerFirst;
        } else {
            currentPlayer = playerSecond;
        }
        System.out.println(currentPlayer + "'s turn:");
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        while (NoOfPencil > 0) {
            printRemainingPencils(counter);
            NoOfPencil -= scanner.nextInt();
            counter++;
        }

    }
}
