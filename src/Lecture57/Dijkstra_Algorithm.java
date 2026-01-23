package Lecture57;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {

    class DijPair {
        int vtx;
        String acqPath;
        int cost;

        @Override
        public String toString() {
            return vtx + " " + acqPath + " @" + cost;
        }

        public DijPair(int vtx, String acqPath, int cost) {
            // this for class ka local variable
            this.vtx = vtx;
            this.acqPath = acqPath;
            this.cost = cost;

        }
    }

    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void minCost(int src){
        PriorityQueue<DijPair> pq = new PriorityQueue<>((a,b) -> a.cost-b.cost);
        HashSet<Integer> isVisited = new HashSet<>();
        pq.add(new DijPair(src, src+"", 0));
        while(!pq.isEmpty()){
            // remove
            DijPair dp = pq.poll();
            // ignore
            if(isVisited.contains(dp.vtx)){
                continue;
            }
            // mark visited
            isVisited.add(dp.vtx);
            // self work
            System.out.println(dp.toString());
            // add nbrs
            for(int other: map.get(dp.vtx).keySet()){
                if(!isVisited.contains(other)){
                    int cost = map.get(dp.vtx).get(other);
                    pq.add(new DijPair(other, dp.acqPath + other , dp.cost + cost));
                }
            }
        }
    }

    public void minCost(int src, int des){
        PriorityQueue<DijPair> pq = new PriorityQueue<>((a,b) -> a.cost-b.cost);
        HashSet<Integer> isVisited = new HashSet<>();
        pq.add(new DijPair(src, src+"", 0));
        while(!pq.isEmpty()){
            // remove
            DijPair dp = pq.poll();

            // ignore
            if(isVisited.contains(dp.vtx)){
                continue;
            }
            // mark visited
            isVisited.add(dp.vtx);
            // self work
            System.out.println(dp.toString());
            if(dp.vtx == des){
                break;
            }
            // add nbrs
            for(int other: map.get(dp.vtx).keySet()){
                if(!isVisited.contains(other)){
                    int cost = map.get(dp.vtx).get(other);
                    pq.add(new DijPair(other, dp.acqPath + other , dp.cost + cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Dijkstra_Algorithm da = new Dijkstra_Algorithm(7);
        da.AddEdge(1, 4, 7);
        da.AddEdge(1, 2, 4);
        da.AddEdge(2, 3, 1);
        da.AddEdge(3, 4, 1);
        da.AddEdge(4, 5, 5);
        da.AddEdge(5, 6, 5);
        da.AddEdge(5, 7, 3);
        da.AddEdge(6, 7, 1);
        da.minCost(3);
        System.out.println("--------------------");
        da.minCost(1, 4);
    }
}
