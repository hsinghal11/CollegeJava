package BootCamp.Day1;

public class GraphArr {

    private int[][] store;

    public GraphArr(int n){
        store = new int[n][n];
    }

    public void addVtx(int v1, int v2){
        store[v1][v2] = 1;
        store[v2][v1] = 1;
    }

    public void display(){
        int n = store.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(store[i][j]+" ");
            }
            System.out.println();
        }
    }
}
