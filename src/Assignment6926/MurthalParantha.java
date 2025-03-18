package Assignment6926;

import java.util.Arrays;
import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        Arrays.sort(arr);
        Arrays.sort(temp);
        int i = 0;
        int max = arr[n-1];
        total--;
        while (total>0){
//            if(i==n-1){
//                temp[i]+=arr[i];
//                total--;
//                i = 0;
//            }
//            else if(temp[i]<=temp[i+1]){
//                total--;
//                temp[i]+=arr[i];
//            } else {
//                i+=1;
//            }
            if(i==n-1){
                total--;
                temp[i]+=arr[i];
                max = temp[i];
                i = 0;
            }
            else if(temp[i]<=max){
                total--;
                temp[i]+=arr[i];
            }else {
                i+=1;
            }
        }
        System.out.println(Arrays.toString(temp));
        int ans = 0;
        for (int j = 0; j < n; j++) {
            if(temp[i]>ans) ans=temp[i];
        }
        System.out.println(ans);
    }
}
