package Lecture25;

public class N_queen {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 4;
        boolean[][] board = new boolean[n][n];
        QueenProblem(board, n, 0);

    }

    private static void QueenProblem(boolean[][] board, int n, int row) {
        if(n == 0){
            display(board);
            System.out.println();
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if(isSafe(board, i, row)){
                board[row][i] = true;
                QueenProblem(board, n-1, row+1);
                board[row][i] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int col, int row) {
        // upper
        for (int i = row; i >= 0 ; i--) {
            if(board[i][col]) return false;
        }
        // diagonal left
        int r = row;
        int c = col;
        while (r>=0 && c>=0 ){
            if(board[r][c]) return false;
            r--;
            c--;
        }
        // diagonal right
        r = row;
        c= col;
        while (r >= 0 && c <board[0].length){
            if(board[r][c]) return false;
            r--;
            c++;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]) System.out.print("[Q] ");
                else System.out.print("[ ] ");
            }
            System.out.println();
        }
    }
}
