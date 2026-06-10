import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = -1;
            }
        }

        board[0][0] = 0;

        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (solveKTUtil(0, 0, 1, board, xMove, yMove, n)) {
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(board[i][j]);
                }
                result.add(row);
            }
        }
        
        return result; 
    }

    private boolean solveKTUtil(int x, int y, int moveIdx, int[][] board, int[] xMove, int[] yMove, int n) {
        if (moveIdx == n * n) {
            return true;
        }

        for (int k = 0; k < 8; k++) {
            int nextX = x + xMove[k];
            int nextY = y + yMove[k];

            if (isSafe(nextX, nextY, board, n)) {
                board[nextX][nextY] = moveIdx;
                
                if (solveKTUtil(nextX, nextY, moveIdx + 1, board, xMove, yMove, n)) {
                    return true;
                } else {
                    board[nextX][nextY] = -1; 
                }
            }
        }
        return false;
    }

    private boolean isSafe(int x, int y, int[][] board, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n && board[x][y] == -1);
    }
}