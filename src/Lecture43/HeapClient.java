package Lecture43;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapClient {

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(7);
        hp.add(5);
        hp.add(9);
        hp.add(4);
        hp.add(3);
        hp.add(2);
        hp.add(1);
        hp.Display();
        System.out.println(hp.remove());
        hp.Display();
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default min heap
        pq.add(5);
        pq.add(7);
        pq.add(9);
        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        System.out.println(pq);
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder()); // default max heap
        p.add(5);
        p.add(7);
        p.add(9);
        p.add(4);
        p.add(2);
        p.add(3);

        p.add(1);
        System.out.println(p);

    }
}
