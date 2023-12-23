package csci1110.Homework.LinkedListPrep;

public class LinkedList {
    private Node head;
    private int count;

    //constructor
    public LinkedList(){
        head = null;
        count = 0;
    }

    //add a node to the head of the linked list
    public void addFirst(Object o){
        Node n;
        n = new Node(o, head); // o is data of Node
        // n.next = head
        head = n;
        count++;

    }

    //add a node to the end of the list
    public void addToEnd (Object o){
        if (isEmpty()) { // if (head == null)
            addFirst(o);
        }
        else {
            Node curr = head;
            while (curr.getNext() != null)
                curr=curr.getNext();

            Node n = new Node (o, null);
            curr.setNext(n);
            count++;
        }
    }

    //get the current size of the list
    public int size(){
        return count;
    }

    //check if the list is empty
    public boolean isEmpty(){
        return (count==0);
    }

    //clear the list
    public void clear(){
        head = null;
        count=0;
    }

    //get the content of the first node
    public Object getFirstData() {
        if (head==null)
            return "Empty list";
        else
            return head.getData();
    }

    //Get the first node
    public Node getFirst() {
        return head;
    }

    //scan the list and print contents
    public void enumerate() {
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr);
            curr = curr.getNext();
        }

    }

    //Method 1: go through list and count how many times the String is in list
    public  int countWord (Object word){
// WRITE YOUR CODE HERE
        int wordCount = 0;
        boolean exists = false;
        Node curr = head;
        while(curr!=null){
            if (curr.getData().equals(word)){
                exists = true;
                wordCount+=1;
            }
            curr = curr.getNext();
        }
        if(exists){
            return wordCount;
        }
        else{
            return -1;
        }
    }

    //Method 2: assume first Node in list is index 0, return index of last occurance of String or -1
    public int lastIndexOf (Object word){
// WRITE YOUR CODE HERE
        Node curr = head;
        int lastIndex = -1;
        int currIndex = 0;

        while (curr != null){
            if (curr.getData().equals(word)){
                lastIndex = currIndex;
            }
            curr = curr.getNext();
            currIndex +=1;
        }
        return lastIndex;
    }

    //Method 3: method removes all occurrences of String from the list and returns removals count
    public int remove (Object word) {
// WRITE YOUR CODE HERE
        Node curr = head;
        Node prev = null;
        int removeCount = 0;

        while(curr != null){
            if (curr.getData().equals(word)){
                if(prev == null){
                    head = curr.getNext();
                }
                else{
                    prev.setNext(curr.getNext()); // ???
                }
                removeCount +=1;
            }
            else{
                prev = curr;
            }
            curr = curr.getNext();
        }
        count -= removeCount;
        return removeCount;
    }

    //Method 4: method takes in another LinkedList and interweaves the content with this list
    //Note: the first item in new LinkedList is from this list.
    public LinkedList interweave (LinkedList list){
// WRITE YOUR CODE HERE
        LinkedList interweave = new LinkedList();
        Node currThis = head;
        Node currOther = list.head;

        while(currThis != null || currOther != null){
            if(currThis != null){
                interweave.addToEnd(currThis.getData());
                currThis = currThis.getNext();
            }
            if (currOther != null){
                interweave.addToEnd(currOther.getData());
                currOther = currOther.getNext();
            }
        }
        return interweave;
    }
}
