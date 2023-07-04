import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        HumanPlayer p1 = new HumanPlayer("SHREYA", 'x');
        AIPlayer p2 = new AIPlayer("CHITTI", 'o');

        player cp;
        cp = p1;

        while (true) {
            System.out.println(cp.name + " turn ");
            cp.makeMove();
            TicTacToe.dispBoard();

            if (TicTacToe.checkRowWin() || TicTacToe.checkColWin() || TicTacToe.checkDiagWin()) {
                System.out.println(cp.name + " Has Won");
                break;
            } else if (TicTacToe.checkDraw()) {
                System.out.println("Game is draw!!!");
                break;
            } else {
                if (cp == p1) {
                    cp = p2;
                } else {
                    cp = p1;
                }
            }
        }
    }
}

