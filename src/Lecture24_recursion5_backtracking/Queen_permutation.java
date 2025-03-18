package Lecture24_recursion5_backtracking;

import java.util.Arrays;

public class Queen_permutation {
    public static void main(String[] args) {
        int queen = 3;
        int boardNum = 3;
        boolean[] board = new boolean[boardNum];
//        System.out.println(Arrays.toString(board));
        int total = printPrem(queen, "", board, 0);
        System.out.println(total);
    }

    private static int printPrem(int queen, String ans, boolean[] board, int queen_num) {
        if (queen == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (!board[i]) {
                board[i] = true;
                count += printPrem(queen - 1, ans + "b" + i + "q" + queen_num, board, queen_num + 1);
                board[i] = false;
            }
        }
        return count;
    }
}
