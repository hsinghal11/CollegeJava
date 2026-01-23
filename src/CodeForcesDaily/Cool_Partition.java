package CodeForcesDaily;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cool_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            Set<Integer> s = new HashSet<>();
            Set<Integer> total = new HashSet<>();
            for (int i = 0; i < n; i++) {
                total.add(arr[i]);
                s.remove(arr[i]);
                if(s.isEmpty()){
                    ans++;
                    s=new HashSet<>(total);
                }
            }
            System.out.println(ans);
        }
    }
}
