package stage2;

import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();


        System.out.println("---------");
        for (int j = 0; j < 1; j++) {
            System.out.println("| " + str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2) + " |");
        }
        for (int j = 3; j < 4; j++) {
            System.out.println("| " + str.charAt(3) + " " + str.charAt(4) + " " + str.charAt(5) + " |");
        }
        for (int j = 6; j < 7; j++) {
            System.out.println("| " + str.charAt(6) + " " + str.charAt(7) + " " + str.charAt(8) + " |");
        }
        System.out.println("---------");
    }
}
