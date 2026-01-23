package BootCamp.Day2;

import java.util.*;
public class Islands {
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] arr = new boolean[n];
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(!arr[i]){
                ans++;
                q.offer(i);

                while(!q.isEmpty()){
                    int r = q.poll();

                    if(arr[r]){
                        continue;
                    }

                    arr[r] = true;

                    for(int ele=0; ele<n; ele++){
                        if(!arr[ele] && isConnected[r][ele] == 1){
                            q.offer(ele);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
