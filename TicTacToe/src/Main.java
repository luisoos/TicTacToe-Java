public class Main {

    public static void main(String[] args) {

        // Declaring standard variables
        int player = 0;
        int winner = -1;
        int[] board = new int[9]; // 9 fields on the board
        for(int i = 0; i < board.length; i++) {
            board[i] = -1;
        }

        // Declaring who is the player
        Player a = new Player(0);
        Player b = new Player(1);
        Player[] players = new Player[2];
        players[0] = a;
        players[1] = b;

        // Play
        while(winner == -1) {

            boardPrint(board);
            int turnField = players[player].getTurn();
            if(players[player].validateTurn(board, turnField)) {
                board[turnField] = a.number;
                player = (player + 1) % 2;
            }

            winner = checkWinner(board);

        }
        System.out.println("Player " + winner + " wins!");
    }

    // Check if someone wins
    public static int checkWinner(int[] board) {

        int winner = -1;

        if(board[0] == board[1] && board[0] == board[2] && board[0] != -1) {
            winner = board[0];
        }
        else if(board[3] == board[4] && board[3] == board[5] && board[0] != -1) {
            winner = board [3];
        }
        else if(board[6] == board[7] && board[6] == board[8] && board[0] != -1) {
            winner = board [6];
        }
        else if(board[0] == board[3] && board[0] == board[6] && board[0] != -1) {
            winner = board [0];
        }
        else if(board[1] == board[4] && board[1] == board[7] && board[0] != -1) {
            winner = board [1];
        }
        else if(board[2] == board[5] && board[2] == board[8] && board[0] != -1) {
            winner = board [2];
        }
        else if(board[0] == board[4] && board[0] == board[8] && board[0] != -1) {
            winner = board [0];
        }
        else if(board[2] == board[4] && board[2] == board[7] && board[0] != -1) {
            winner = board [2];
        }
        else {
            winner = -1;
        }

        return winner;

    }

    public static void boardPrint(int[] myBoard) {

        System.out.println(myBoard[0] + " | " + myBoard[1] + " | " + myBoard[2]);
        System.out.println("-------------");
        System.out.println(myBoard[3] + " | " + myBoard[4] + " | " + myBoard[5]);
        System.out.println("-------------");
        System.out.println(myBoard[6] + " | " + myBoard[7] + " | " + myBoard[8]);

    }

}
