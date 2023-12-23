package csci1110.Homework.LinkedListPrep;

// SINGLY LINKED LIST
public class LList {
        private Node head;
        private Node tail;
        private int size;


        private class Node {
            private String data;
            private Node next;
        }

        public LList(){
            head = null;
            tail = null;
            size = 0;
        }

        public String getFirst(){
            if (head == null){ // list is empty
                return null;
            }
            return head.data;
        }

        public String getLast(){
            if(tail == null){ // if true, list is empty
                return null;
            }
            return tail.data;
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
                head = n;
            }
            size++;
        }

        public void addLast(String data){
            Node n = new Node();
            n.data = data;

            if(head == null){
                head = n;
                tail = n;
            }
            else{
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

            if (head == null){ // only one element was in LList & was removed
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

            Node curr = head;
            while (curr.next != tail){
                curr = curr.next;
            }

            tail = curr;
            if (tail == null){
                head = null;
            }
            size--;
            return data;
        }

}
