import java.util.Scanner;
public class TurnHandler {
    public static void handle(char[][] board, Scanner input, char player) {
        System.out.println("Player " + player);
        System.out.println("Enter Line X");
        int x = input.nextInt();
        System.out.println("Enter Line Y");
        int y = input.nextInt();
        board[x][y] = player;
    }
}
