package Lecture25;

import java.util.*;
public class Rat_Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {// row
            String s = sc.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = s.charAt(j);
            }
            System.out.println(Arrays.toString(maze[i]));
        }
        int[][] ans = new int[n][m];
        print(maze, 0,0, ans);
        if(!val){
            System.out.println("NO PATH FOUND");
        }
    }

    static boolean val = false;

    private static void print(char[][] maze, int x,int y, int[][] ans){
        if(x < 0|| y<0|| x>=maze.length|| y>= maze[0].length || maze[x][y] == 'X') return;
        if(x == maze.length-1 && y == maze[0].length-1){
            ans[x][y] = 1;
            display(ans);
            val = true;
        }
        maze[x][y] = 'X';
        ans[x][y] = 1;
        int[] r = {-1,0,1,0};
        int[] c = {0,-1,0,1};
        for (int i = 0; i < r.length; i++) {
            print(maze, x+r[i], y+c[i], ans);
        }
        maze[x][y] = 'O';
        ans[x][y] = 0;

    }

    private static void display(int[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
