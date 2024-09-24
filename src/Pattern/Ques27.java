package Pattern;

public class Ques27 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row <= n){
            int val = 1;
            int i = 1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= star){
                System.out.print(val+" ");
                if(j < (star/2)+1){
                    val++;
                } else {
                    val--;
                }

                j++;
            }

            System.out.println();
            row++;
            space--;
            star+=2;
        }
    }
}
