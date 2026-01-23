package BootCamp.Day1;

public class GraphClient {
    public static void main(String[] args) {
        GraphArr gp = new GraphArr(4);
        gp.addVtx(1,2);
        gp.addVtx(2,3);
        gp.addVtx(2,0);
        gp.addVtx(1,0);
        gp.display();

        System.out.println();

        GraphAdja gra = new GraphAdja();
        gra.addVtx(1,2);
        gra.addVtx(2,3);
        gra.addVtx(2,0);
        gra.addVtx(1,0);
        gra.display();

    }
}
