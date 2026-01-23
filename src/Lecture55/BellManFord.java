package Lecture55;

import java.util.*;

public class BellManFord {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public BellManFord(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
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

    public void BellManFord() {
        int v = map.size();
        int[] dp = new int[v + 1];
        // src == 1
        for (int i = 2; i < dp.length; i++) {
            dp[i] = 9999999;
        }
        List<EdgePair> ll = getAllEdge();
        for (int i = 1; i <= v; i++) {
            for (EdgePair e : ll) {
                if (i==v && dp[e.e2] > dp[e.e1] + e.cost) {
                    System.out.println("-ve weight ka cycle h");
                    return;
                }
                if (dp[e.e2] > dp[e.e1] + e.cost) {
                    dp[e.e2] = dp[e.e1] + e.cost;
                }
            }
        }
    }
}
