package Lecture56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Kruskals_algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Kruskals_algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class EdgePair {
        int e1, e2, cost;

        @Override
        public String toString() {
            return e1 + " " + e2 + " @" + cost;
        }

        public EdgePair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }

    public List<EdgePair> getAllEdge() {
        List<EdgePair> ll = new ArrayList<>();
        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public void Kruskals_Algo() {
        List<EdgePair> ll = getAllEdge();
        Collections.sort(ll, (a, b) -> a.cost - b.cost);
        DisJoinSet dsu = new DisJoinSet();
        for (int v : map.keySet()) {
            dsu.create(v); // created set for each vtx
        }
        int cost = 0;
        for (EdgePair e : ll) {
            int re1 = dsu.find(e.e1); // representative of 1st element
            int re2 = dsu.find(e.e2);
            if (re1 == re2) {
                // we got the cycle that there parents are same
                continue;
            } else {
                dsu.union(re1, re2);
                cost += e.cost;
                System.out.println(e);
            }
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        Kruskals_algorithm g = new Kruskals_algorithm(7);
        g.AddEdge(1,4, 4);
        g.AddEdge(1,2, 3);
        g.AddEdge(3,2, 5);
        g.AddEdge(3,4, 6);
        g.AddEdge(5,4, 8);
        g.AddEdge(5,6, 2);
        g.AddEdge(5,7, 1);
        g.AddEdge(6,7,9);
        g.Kruskals_Algo();
    }
}
