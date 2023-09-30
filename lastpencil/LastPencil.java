package lastpencil;

import java.util.Scanner;

public class LastPencil {

    public static int NoOfPencil;
    public static String playerName;

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pencils would you like to use:");
        NoOfPencil = scanner.nextInt();

        System.out.println("Who will be the first (John, Jack):");
        playerName = scanner.next();

        printPencils();
        System.out.print(playerName + "is going first!");
    }

    private static void printPencils() {
        for (int i=0; i<NoOfPencil; i++) {
            System.out.print("|");
        }
        System.out.println();
    }
}
