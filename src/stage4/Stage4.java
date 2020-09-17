package stage4;

import java.util.Scanner;

public class Stage4 {
    public static void print(String input) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %c %c %c |%n", input.charAt(i * 3), input.charAt(i * 3 + 1), input.charAt(i * 3 + 2));
        }
        System.out.println("---------");
    }
    public static void getInput(String input, Scanner scanner) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x);

        while ((x > 3 || x < 1 || y > 3 || y < 1)) {
            System.out.println("Coordinates should be from 1 to 3!");
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x);
        }

        System.out.println(x);
        if (input.charAt(8 - y * 3 + x) == '_') {
            String newInput = input.substring(0, 8 - y * 3 + x) + 'X' + input.substring(9 - y * 3 + x);
            print(newInput);
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            getInput(input, scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        print(input);

        getInput(input, scanner);
    }
}

