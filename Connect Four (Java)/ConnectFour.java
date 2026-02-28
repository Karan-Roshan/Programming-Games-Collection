// Connect Four - 2 Players Game

import java.util.Scanner;

public class ConnectFour {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static char[][] board = new char[ROWS][COLS];

    public static void main(String[] args) {
        initializeBoard();
        char player1 = 'X';
        char player2 = 'O';
        char currentPlayer = player1;
        boolean gameWon = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameWon) {
            printBoard();
            System.out.print("Player " + (currentPlayer == player1 ? "1 (X)" : "2 (O)") + ", choose a column (0-6): ");
            int column = scanner.nextInt();

            if (column < 0 || column >= COLS || !dropDisc(column, currentPlayer)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Player " + (currentPlayer == player1 ? "1 (X)" : "2 (O)") + " wins!");
                gameWon = true;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1; // Switch player
            }
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '.';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6");
    }

    private static boolean dropDisc(int col, char disc) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == '.') {
                board[i][col] = disc;
                return true;
            }
        }
        return false;
    }

    private static boolean checkWin(char disc) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board[r][c] == disc) {
                    if (c + 3 < COLS && board[r][c + 1] == disc && board[r][c + 2] == disc && board[r][c + 3] == disc)
                        return true;
                    if (r + 3 < ROWS && board[r + 1][c] == disc && board[r + 2][c] == disc && board[r + 3][c] == disc)
                        return true;
                    if (r + 3 < ROWS && c + 3 < COLS && board[r + 1][c + 1] == disc && board[r + 2][c + 2] == disc
                            && board[r + 3][c + 3] == disc)
                        return true;
                    if (r - 3 >= 0 && c + 3 < COLS && board[r - 1][c + 1] == disc && board[r - 2][c + 2] == disc
                            && board[r - 3][c + 3] == disc)
                        return true;
                }
            }
        }
        return false;
    }
}
