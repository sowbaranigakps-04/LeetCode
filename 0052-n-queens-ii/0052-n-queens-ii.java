class Solution {

    private boolean isSafe(int row, int col, int n, char[][] board) {
        for (int c = 0; c < col; c++)
            if (board[row][c] == 'Q') return false;

        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--)
            if (board[r][c] == 'Q') return false;

        for (int r = row, c = col; r < n && c >= 0; r++, c--)
            if (board[r][c] == 'Q') return false;

        return true;
    }

    private void backtrack(int col, int n, char[][] board, int[] count) {
        if (col == n) {
            count[0]++;
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q';     
                backtrack(col + 1, n, board, count);
                board[row][col] = '.';      
            }
        }
    }

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');

        int[] count = new int[1];  
        backtrack(0, n, board, count);
        return count[0];
    }
}