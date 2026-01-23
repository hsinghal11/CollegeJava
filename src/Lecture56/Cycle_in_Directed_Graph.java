package Lecture56;

import java.util.*;

public class Cycle_in_Directed_Graph {
    private HashMap<Integer, List<Integer>> map;

    public Cycle_in_Directed_Graph(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void AddEdge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    public int[] indegree() {
        int[] in = new int[map.size()];
        for(int v1 : map.keySet()){
            for(int v2: map.get(v1)){
                in[v2]++;
            }
        }
        return in;
    }
    public boolean IsCycle(){
        Queue<Integer> q = new LinkedList<>();
        int[] in = indegree();
        for (int i = 0; i < in.length; i++) {
            if(in[i] == 1){
                q.add(i);
            }
        }
        int c = 0;
        while (!q.isEmpty()){
            int r = q.poll();
            c++;
            System.out.println(r + " ");
            for(int nbrs: map.get(r)){
                in[nbrs] --;
                if(in[nbrs] == 0){
                    q.add(nbrs);
                }
            }
        }
        return c != map.size();
    }
}
