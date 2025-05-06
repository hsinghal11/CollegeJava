package Lecture24_recursion5_backtracking;

public class Queen_combination {
    public static void main(String[] args) {
        int queen = 2;
        int boardNum = 4;
        boolean[] board = new boolean[boardNum];
//        System.out.println(Arrays.toString(board));
        int total = printcomb(queen, "", board, 0, 0);
        System.out.println(total);
    }

    private static int printcomb(int queen, String ans, boolean[] board, int queen_num, int idx){
        if (queen == 0) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = idx; i < board.length; i++) {
            if (!board[i]) {
                board[i] = true;
                count += printcomb(queen - 1, ans + "b" + i + "q" + queen_num, board, queen_num + 1,i+1);
                board[i] = false;
            }
        }
        return count;
    }
}
