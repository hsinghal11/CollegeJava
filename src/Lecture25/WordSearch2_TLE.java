package Lecture25;

import java.util.*;
public class WordSearch2_TLE {
    public static void main(String[] args) {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] word = {"oath", "pea", "eat", "rain"};
        List<String> ll = new ArrayList<>();
        for (int k = 0; k < word.length; k++) {
            boolean found = false;
            for (int i = 0; i < board.length && !found; i++) {
                for (int j = 0; j < board[0].length && !found; j++) {
                    if (word[k].charAt(0) == board[i][j]) {
                        boolean ans = search(board, word[k], i, j, 0);
                        if (ans == true) {
                            ll.add(word[k]);
                            found = true;
                        }
                    }
                }
            }
        }
        System.out.println(ll);
    }

    private static boolean search(char[][] board, String word, int x, int y, int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || word.charAt(idx) != board[x][y])
            return false;

        char temp = board[x][y];
        board[x][y] = '*';
        int[] r = {-1, 0, 1, 0};
        int[] c = {0, -1, 0, 1};
        for (int i = 0; i < r.length; i++) {
            boolean ans = search(board, word, x + r[i], y + c[i], idx + 1);
            if (ans == true) {
                board[x][y] = temp;
                return true;
            }
        }
        board[x][y] = temp;
        return false;
    }
}

