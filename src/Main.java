import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int turn = 0;
        boolean win = false;
        char playerX = 'X';
        char playerO = 'O';
        Scanner input = new Scanner(System.in);

        char[][] board = {      {'-','-','-'}, //Create Board
                                {'-','-','-'},
                                {'-','-','-'}
        };

        while (!win) {

            if (turn % 2 == 0) {
                PrintBoard.print(board);
                TurnHandler.handle(board, input, playerX);
                WinCheck.check(board,win,playerX);
                turn++;
            }

            if (turn % 2 == 1) {
                PrintBoard.print(board);
                TurnHandler.handle(board, input, playerO);
                WinCheck.check(board, win, playerO);
                turn++;
            }
        }
    }
}

