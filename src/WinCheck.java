public class WinCheck {
    public static void check(char[][] board, boolean win, char player){
        //Horizontal check
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }
        if (board[1][0] == board[1][1] && board[0][0] == board[1][2] && board[1][0] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }
        if (board[2][0] == board[2][1] && board[0][0] == board[2][2] && board[2][0] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }

        //Vertical Check
        if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }
        if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }
        if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }

        //Diagonal check
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == player) {
            System.out.println("YOU WIN PLAYER " + player);
            win = true;
        }
    }
}
