package Lecture36_37;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree(){
        root = createTree();
    }

    private Node createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = createTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = createTree();
        }
        return nn;
    }

    public void Display(){
        display(root);
    }

    private void display(Node nn){
        if(nn == null) return;
        String s = "<--"+nn.val+"-->";
        if(nn.left != null){
            s=nn.left.val+s;
        }else{
            s="."+s;
        }
        if(nn.right != null){
            s=s+nn.right.val;
        }else{
            s=s+".";
        }
        System.out.println(s);
        display(nn.left);
        display(nn.right);
    }

    public int max() {
        return max(root);
    }

    private int max(Node nn) {
        if(nn == null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(nn.left);
        int rmax = max(nn.right);

        return Math.max(nn.val,Math.max(lmax, rmax));
    }

    public boolean find(int item) {
        return find(root, item);
    }

    private boolean find(Node nn, int item) {
        if(nn == null){
            return false;
        }
        if(nn.val == item) return true;
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);

        return left || right;
    }

    public int ht() {
        return ht(root);
    }

    private int ht(Node nn) {
        if(nn == null) return -1;

        int height_left = ht(nn.left);
        int height_right = ht(nn.right);

        return Math.max(height_left, height_right) + 1;
    }

    public void PreOrder() {
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void INOrder() {
        INOrder(this.root);
        System.out.println();
    }

    private void INOrder(Node node) {
        // TODO Auto-generated method stub
        if (node == null) {
            return;
        }
        INOrder(node.left);
        System.out.print(node.val + " ");
        INOrder(node.right);
    }

    public void POStOrder() {
        POStOrder(this.root);
        System.out.println();
    }

    private void POStOrder(Node node) {
        // TODO Auto-generated method stub
        if (node == null) {
            return;
        }
        POStOrder(node.left);
        POStOrder(node.right);
        System.out.print(node.val + " ");
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node rv = q.remove();
            System.out.print(rv.val+" ");
            if(rv.left!=null) q.add(rv.left);
            if(rv.right != null) q.add(rv.right);
        }
        System.out.println();
    }
}
