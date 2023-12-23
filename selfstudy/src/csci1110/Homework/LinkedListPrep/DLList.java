package csci1110.Homework.LinkedListPrep;

public class DLList {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private String data;
        private Node next;
        private Node prev;
    }

    public DLList(){
        head = null;
        tail = null;
        size = 0;
    }

    public String getFirst(){
        if (head == null){
            return null;
        }
        return head.data;
    }

    public String getLast(){
        if (tail == null){
            return null;
        }
        else{
            return tail.data;
        }
    }

    public void addFirst(String data){
        Node n = new Node();
        n.data = data;

        if (head == null){
            head = n;
            tail = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }

    public void addLast(String data){
        Node n = new Node();
        n.data = data;

        if (tail == null){
            head = n;
            tail = n;
        }
        else{
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public String removeFirst(){
        if (head == null){
            return null;
        }
        String data = head.data;

        head = head.next;
        head.prev = null;

        if (head == null){ //LList contained one element & it was removed
            tail = null;
        }
        size--;
        return data;
    }

    public String removeLast(){
        if (tail == null){
            return null;
        }
        String data = tail.data;
        tail = tail.prev;
        tail.next = null;

        if (tail == null){ // LList contained one element which was removed
            head = null;
        }
        size--;
        return data;
    }

    public void insert(int index, String data){
        Node curr = head;
        for (int i=0; i<index; i++){
            curr = curr.next;
        }

        Node n = new Node();
        n.data = data;

        n.prev = curr.prev;
        n.next = curr.next;

        n.prev.next = n;
        curr.prev = n;

        size++;
    }

}
