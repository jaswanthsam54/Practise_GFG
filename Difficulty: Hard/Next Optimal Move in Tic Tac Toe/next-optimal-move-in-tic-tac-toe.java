import java.util.ArrayList;
import java.util.List;

class Solution {
    // Evaluates the board score: +10 if 'x' wins, -10 if 'o' wins, 0 otherwise.
    static int evaluate(char[][] b) {
        // Checking Rows for X or O victory.
        for (int row = 0; row < 3; row++) {
            if (b[row][0] == b[row][1] && b[row][1] == b[row][2]) {
                if (b[row][0] == 'x') return +10;
                else if (b[row][0] == 'o') return -10;
            }
        }

        // Checking Columns for X or O victory.
        for (int col = 0; col < 3; col++) {
            if (b[0][col] == b[1][col] && b[1][col] == b[2][col]) {
                if (b[0][col] == 'x') return +10;
                else if (b[0][col] == 'o') return -10;
            }
        }

        // Checking Diagonals for X or O victory.
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            if (b[0][0] == 'x') return +10;
            else if (b[0][0] == 'o') return -10;
        }

        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            if (b[0][2] == 'x') return +10;
            else if (b[0][2] == 'o') return -10;
        }

        return 0;
    }

    // Checks if there are any empty spaces remaining on the board
    static boolean isMovesLeft(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') return true;
            }
        }
        return false;
    }

    // Minimax recursive function without depth tracking
    static int minimax(char[][] board, boolean isMax) {
        int score = evaluate(board);

        if (score == 10) return score;
        if (score == -10) return score;
        if (!isMovesLeft(board)) return 0;

        if (isMax) {
            int best = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = 'x'; 
                        best = Math.max(best, minimax(board, false));
                        board[i][j] = '_'; 
                    }
                }
            }
            return best;
        } else {
            int best = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = 'o'; 
                        best = Math.min(best, minimax(board, true));
                        board[i][j] = '_'; 
                    }
                }
            }
            return best;
        }
    }

    static List<Integer> findBestMove(char board[][]) {
        int bestVal = -1000;
        int row = -1;
        int col = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    board[i][j] = 'x'; 
                    int moveVal = minimax(board, false);
                    board[i][j] = '_'; 

                    // Using strict greater-than (>) preserves the first optimal move found
                    if (moveVal > bestVal) {
                        row = i;
                        col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(row);
        result.add(col);
        return result;
    }
}