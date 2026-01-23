package Lecture58;

import java.util.LinkedList;
import java.util.Queue;

public class Longest_Cycle_in_a_Graph {
    public int longestCycle(int[] edges) {
        int[] in = new int[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != -1) {
                in[edges[i]]++;

            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.offer(i);
            }
        }
        boolean[] visited = new boolean[edges.length];
        while (!q.isEmpty()) {
            int idx = q.poll();
            visited[idx] = true;
            if(edges[idx] != -1) {
                in[edges[idx]]--;
                if (in[edges[idx]] == 0) {
                    q.offer(edges[idx]);
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                int count = 1;
                visited[i] = true;
                int nbrs = edges[i];
                while (nbrs != i) {
                    count++;
                    visited[nbrs] = true;
                    nbrs = edges[nbrs];
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Longest_Cycle_in_a_Graph l = new Longest_Cycle_in_a_Graph();
        int[] edges = {3, 3, 4, 2, 3};
        l.longestCycle(edges);
    }
}
