package Lecture53;

import java.util.*;

public class Graph_Valid_Tree {
    class Solution {
        public boolean validTree(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                int v1 = edges[i][0];
                int v2 = edges[i][1];
                map.get(v1).add(v2);
                map.get(v1).add(v1);
            }
            return false;
        }

        public boolean BFT(HashMap<Integer, List<Integer>> map) {
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> visited = new HashSet<>();
            int c = 0;
            for (int src : map.keySet()) {
                if (visited.contains(src)) {
                    continue;
                }
                c++;
                q.add(src);
                while (!q.isEmpty()) {
                    // 1. Remove
                    int r = q.poll();
                    // 2. Ignore
                    if (visited.contains(r)) {
                        return false;
                    }
                    // 3. Mark Visited
                    visited.add(r);
                    // 4. Self Work
                    System.out.print(r + " ");
                    // 5. Add Unvisited Nbrs
                    for (int nbrs : map.get(r)) {
                        if (!visited.contains(nbrs)) {
                            q.add(nbrs);
                        }
                    }
                }
            }
            return c == 1;
        }
    }
}
