package Lecture12;

public class Wave_print {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4, 5}, {1, 8, 9, 7}, {12, 56, 78, 23}};
        for (int i = 0; i < arr[0].length; i++) {
            if(i%2 == 0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            } else {
                for (int j = arr.length-1; j >= 0 ; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
