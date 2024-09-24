package Contest970CodeForces;

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        while(z-->0){
            int n=sc.nextInt();
            int t=n;
            int sum=0;
            int c=4;
            while(c-->0){
                int rem=t%10;
                sum=sum*10+rem;
                t=t/10;
            }
            System.out.println(sum);
            int p=1;
            int ans=0;
            int m=1;
            while(m<=4){
                int rem=sum%10;
                if(rem==0){
                    rem=10;
                }
                int q=Math.abs(rem-p);
                p=rem;
                ans=ans+(q+1);
                sum/=10;
                m++;
            }
            System.out.println(ans);
        }


    }

}