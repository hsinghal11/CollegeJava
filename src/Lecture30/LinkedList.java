package Lecture30;

public class LinkedList {
    class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void AddFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    //O(1)
    public void AddLast(int item){
        if(size==0){
            AddFirst(item);
        }else{
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    //O(N)
    public void addAtIndex(int item, int idx) throws Exception {
        if(idx == 0) AddFirst(item);
        else if (idx == size) AddLast(item);
        else{
            Node nn = new Node();
            nn.val = item;
            Node prev = getNode(idx - 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }


    public int getFirst(){
        return head.val;
    }

    public int getLast(){
        return tail.val;
    }

    public int getAtIndex(int idx) throws Exception {
        return getNode(idx).val;
    }

    // O(N)
    public void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // O(1)
    public int removeFirst(){
        int rv = head.val;
        if(size == 1){
            head = null;
            tail= null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rv;
    }

    // O(N)
    public int removeLast() throws Exception {
        if (size == 1){
            return removeFirst();
        }else{
            int rv = tail.val;
            Node prev = getNode(size-2);
            prev.next = null;
            tail = prev;
            size--;
            return rv;
        }
    }

    //O(N)
    public int removeAtIndex(int idx) throws Exception {
        if(idx <0 || idx >=size){
            throw new Exception("Index out of range h babu");
        }
        if(idx == 0){
            return removeFirst();
        } else if (idx == size-1) {
            return removeLast();
        }else{
            Node prev = getNode(idx-1);
            int rv = prev.next.val;
            prev.next = prev.next.next;
            prev.next.next = null;
            size--;
            return rv;
        }
    }

    // O(k)
    private Node getNode(int idx) throws Exception {
        if(idx <0 || idx >= size){
            throw new Exception("Index out of range");
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        return size;
    }

}
