import java.util.Scanner;

public class Player {

    int number;
    Scanner scanner = new Scanner(System.in);

    public Player(int number) {

        this.number = number;

    }

    // Getting the turn recursion
    public int getTurn() {

        System.out.println("Player " + number + " - it's your turn!");
        int input = scanner.nextInt();
        if(input < 9 && input >= 0) {
            return input;
        }
        System.out.println("Please enter a number between 0 and 8!");
        return getTurn();

    }

    // Validate if turn is ok
    public boolean validateTurn(int[] board, int turn) {

        if (board[turn] == -1) {
            return true;
        }
        // else  {
            return false;
        // }

    }

}
