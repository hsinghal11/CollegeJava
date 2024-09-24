import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int star = 2*n+1;
        int row = 1;
        int space = 0;
        while(row <= 2*n+1){
            int i = 1;
            while(i <= space){
                System.out.print(" \t");
                i++;
            }
            int j = 1;
            while(j <= star){
                System.out.print(number+"\t");
                if(j==star) {
                    break;
                }
                else if(j > star/2) number++;
                else number--;
                j++;
            }

            System.out.println();
            if(row > n){
                number++;
                space--;
                star+=2;
            } else {
                number--;
                space++;
                star-=2;
            }
            row++;
        }
    }
}