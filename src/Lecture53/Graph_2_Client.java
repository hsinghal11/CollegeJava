package Lecture53;

import java.util.HashSet;

public class Graph_2_Client {
    public static void main(String[] args) {
        Graph_2 g = new Graph_2(7);
        g.AddEdge(1,2, 5);
        g.AddEdge(1,4, 2);
        g.AddEdge(3,4, -1);
        g.AddEdge(3,2, 7);
        g.AddEdge(4,5, 3);
        g.AddEdge(5,6, 7);
        g.AddEdge(5,7, 8);
        g.AddEdge(6,7,4);
        g.Display();
        System.out.println(g.HasPath(1,6, new HashSet<>()));
        g.allPossiblePath(1,6,new HashSet<>(), "");
        System.out.println("BFS ->"+g.BFS(1,8));
        System.out.println("DFS ->"+g.DFS(1,8));
        g.BFT();
        System.out.println();
        g.DFT();
    }
}
