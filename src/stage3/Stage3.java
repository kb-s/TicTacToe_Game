package stage3;
import java.util.Scanner;

public class Stage3 {
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

        boolean xWins;
        boolean oWins;
        boolean gameNotFinished;
        boolean draw;
        int countX = 0;
        int countO = 0;
        String result = "";

        for (int i = 0; i < 9; i++) {
            if (str.charAt(i) == 'O') {
                countO++;
            } else if (str.charAt(i) == 'X') {
                countX++;
            } else if (str.charAt(i) == '_') {
            }
        }

        xWins = ((str.charAt(0) == 'X' && str.charAt(1) == 'X' && str.charAt(2) == 'X')
                || (str.charAt(3) == 'X' && str.charAt(4) == 'X' && str.charAt(5) == 'X')
                || (str.charAt(6) == 'X' && str.charAt(7) == 'X' && str.charAt(8) == 'X')
                || (str.charAt(0) == 'X' && str.charAt(3) == 'X' && str.charAt(6) == 'X')
                || (str.charAt(1) == 'X' && str.charAt(4) == 'X' && str.charAt(7) == 'X')
                || (str.charAt(2) == 'X' && str.charAt(5) == 'X' && str.charAt(8) == 'X')
                || (str.charAt(0) == 'X' && str.charAt(4) == 'X' && str.charAt(8) == 'X')
                || (str.charAt(2) == 'X' && str.charAt(4) == 'X' && str.charAt(6) == 'X'));

        oWins = ((str.charAt(0) == 'O' && str.charAt(1) == 'O' && str.charAt(2) == 'O')
                || (str.charAt(3) == 'O' && str.charAt(4) == 'O' && str.charAt(5) == 'O')
                || (str.charAt(6) == 'O' && str.charAt(7) == 'O' && str.charAt(8) == 'O')
                || (str.charAt(0) == 'O' && str.charAt(3) == 'O' && str.charAt(6) == 'O')
                || (str.charAt(1) == 'O' && str.charAt(4) == 'O' && str.charAt(7) == 'O')
                || (str.charAt(2) == 'O' && str.charAt(5) == 'O' && str.charAt(8) == 'O')
                || (str.charAt(0) == 'O' && str.charAt(4) == 'O' && str.charAt(8) == 'O')
                || (str.charAt(2) == 'O' && str.charAt(4) == 'O' && str.charAt(6) == 'O'));

        gameNotFinished = ((str.charAt(0) == '_' || str.charAt(1) == '_' || str.charAt(2) == '_'
                || str.charAt(3) == '_' || str.charAt(4) == '_' || str.charAt(5) == '_'
                || str.charAt(6) == '_' || str.charAt(7) == '_' || str.charAt(8) == '_')
                && (!xWins || !oWins));

        draw = ((!xWins && !oWins) && !gameNotFinished);

        if ((xWins && oWins) || Math.abs(countO-countX)>1){
            result = "Impossible";
        }else if (xWins) {
            result = "X wins";

        }else if (oWins) {
            result = "O wins";

        } else if (gameNotFinished){
            result = "Game not finished";
        } else {
            result = "Draw";
        }
        System.out.println(result);


    }

}


