package Lecture52;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean ContainsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int NoOfEdge() {
        int cnt = 0;
        for (int vtx : map.keySet()) {
            cnt += map.get(vtx).size();
        }
        return cnt / 2;
    }

    public void RemoveEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void RemoveVertex(int v1) {
        for (int nbrs : map.get(v1).keySet()) {
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }

    public void Display() {
        for (int v : map.keySet()) {
            System.out.println(v + " " + map.get(v));
        }
    }

    // ques1 -> path exist or not
    public boolean HasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = HasPath(nbrs, des, visited);
                if (ans) {
                    return true;
                }
            }
        }
        return false;
    }

    public void allPossiblePath(int src, int des, HashSet<Integer> visited, String ans){
        if (src == des) {
            System.out.println(ans+src);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                allPossiblePath(nbrs, des, visited, ans+src+"->");
            }
        }
        visited.remove(src);
    }
}
