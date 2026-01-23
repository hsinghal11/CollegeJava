package BootCamp.Day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GraphAdja {

    private HashMap<Integer, ArrayList<Integer>> store;

    public GraphAdja() {
        store = new HashMap<>();
    }

    public void addVtx(int v1, int v2) {
        if (!store.containsKey(v1)) {
            store.put(v1, new ArrayList<>());
        }
        if (!store.containsKey(v2)) {
            store.put(v2, new ArrayList<>());
        }
        store.get(v1).add(v2);
        store.get(v2).add(v1);
    }

    public void display() {
        for (int v : store.keySet()) {
            System.out.print(v + "->");
            for (int i : store.get(v)) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int i) {
        HashSet<Integer> vi = new HashSet<>();
        dfs(vi, i);
    }

    private void dfs(HashSet<Integer> v, int i) {
        v.add(i);
        System.out.print(i+"->");
        for (int ele : store.get(i)) {
            if(!v.contains(ele)){
                dfs(v, ele);
            }
        }
    }
}
