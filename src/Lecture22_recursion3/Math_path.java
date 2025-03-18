package Lecture22_recursion3;

public class Math_path {
    public static void main(String[] args) {
        int m = 3;// row
        int n = 3;// col
        PrintPath(0, 0, m - 1, n - 1, "");
    }
    private static void PrintPath(int currH, int currV, int desH, int desV, String ans){
        if(currH==desH && currV==desV){
            System.out.println(ans);
            return;
        }
        if(currH>desH || currV>desV){
            return;
        }
        PrintPath(currH+1,currV,desH,desV,ans+"H");
        PrintPath(currH,currV+1,desH,desV,ans+"V");
    }
}
