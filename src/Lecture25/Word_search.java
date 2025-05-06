package Lecture25;

public class Word_search {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    boolean ans = search(board, word, i, j, 0);
                    if (ans == true) {
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }

    private static boolean search(char[][] board, String word, int x, int y, int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || word.charAt(idx) != board[x][y])
            return false;

        board[x][y] = '*';
        int[] r = {-1, 0, 1, 0};
        int[] c = {0, -1, 0, 1};
        for (int i = 0; i < r.length; i++) {
            boolean ans = search(board, word, x + r[i], y + c[i], idx + 1);
            if (ans == true) {
                return true;
            }
            board[x][y] = word.charAt(idx);
        }
        return false;
    }
}
