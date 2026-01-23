package Lecture36_37;

public class BinaryTree_Client {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(500));
        System.out.println(bt.ht());
        bt.POStOrder();
        bt.PreOrder();
        bt.INOrder();
        bt.levelOrder();
    }
}
