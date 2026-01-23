package Lecture30;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();

        ll.AddFirst(10);
        ll.AddFirst(30);
        ll.AddLast(20);
        ll.AddLast(99);
        ll.addAtIndex(777, 1);
        ll.addAtIndex(33,4);
        ll.Display();
        System.out.println(ll.size());
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(4));
        System.out.println(ll.removeFirst());
        ll.Display();
        System.out.println(ll.removeLast());
        ll.Display();
        System.out.println(ll.removeAtIndex(3));
        ll.Display();
    }
}
    