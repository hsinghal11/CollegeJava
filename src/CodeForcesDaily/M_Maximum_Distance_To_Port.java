package CodeForcesDaily;

import java.util.*;

public class M_Maximum_Distance_To_Port {
    static HashMap<Integer, List<Integer>> map;

    public static void main(String[] args) {
        map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }

        HashMap<Integer, Integer> dis = bfs();
        int[] distArr = new int[k+1];
        for (int i = 1; i <= n; i++) {
            int val = arr[i-1];
            distArr[val] = Math.max(dis.get(i), distArr[val]);   // -1 if unreachable
        }
        for (int i = 1; i < distArr.length; i++) {
            System.out.print(distArr[i]+" ");
        }
    }

    static class Pair{
        int i;
        int d;
        public Pair(int i, int d){
            this.i = i;
            this.d = d;
        }

    }

    public static HashMap<Integer, Integer> bfs(){
        HashMap<Integer, Integer> dis = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        q.add(new Pair(1, 0));
        dis.put(1, 0);

        while (!q.isEmpty()){
            Pair r = q.poll();
            visited.add(r.i);
            for(int nbrs: map.get(r.i)){
                if(!visited.contains(nbrs)){
                    visited.add(nbrs);
                    dis.put(nbrs, r.d + 1);
                    q.add(new Pair(nbrs, r.d + 1));
                }
            }
        }
        return dis;
    }

}
