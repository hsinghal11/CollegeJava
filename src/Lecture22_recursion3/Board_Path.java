package Lecture22_recursion3;

public class Board_Path {
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        int dice_face = 3;
        System.out.println("\n"+print(n,dice_face, 0, ""));
    }
    private static int  print(int n, int faces, int ans, String ans_string){
        System.out.print(count + " ");
        count+=1;
        if(ans == n){
            System.out.println("\n"+ans_string);
            return 1;
        }
        if(ans>n) return 0;
        int x = 0;
        for (int i = 1; i <= faces; i++) {
            x += print(n, faces, ans+i, ans_string+i);
        }
        return x;
    }
}
