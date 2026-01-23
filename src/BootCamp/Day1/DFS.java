package BootCamp.Day1;

import java.util.HashSet;

public class DFS {
    public static void main(String[] args) {
        GraphAdja gp = new GraphAdja();
        gp.addVtx(1,0);
        gp.addVtx(1,2);
        gp.addVtx(0,2);
        gp.addVtx(3,2);
        gp.addVtx(2,4);

        gp.display();
        gp.dfs(0);

    }

}
