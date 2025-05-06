import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String original = sc.nextLine();
            String given = sc.nextLine();
//            System.out.println(original+" "+given);
            if(solve(original,given)) System.out.println("yes");
            else System.out.println("no");
        }
    }
    private static boolean solve(String o, String g){
        int i = 0;
        int j = 0;

        int n1 = o.length();
        int n2 = g.length();
        while(i<n1 && j<n2) {
            if(o.charAt(i) != g.charAt(j)) return false;
            int countcrr = 0;
            int countlrr = 0;
            char c = o.charAt(i);
            while (i<n1 && o.charAt(i) == c){
                i++;
                countcrr++;
            }
            while (j<n2 && g.charAt(j) == c){
                j++;
                countlrr++;
            }

            if(2*(countcrr) < countlrr || countlrr<countcrr ) return false;
        }
        return (i==n1 && j==n2);
    }
}