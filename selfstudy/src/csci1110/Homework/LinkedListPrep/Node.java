package csci1110.Homework.LinkedListPrep;

// FREEZE CODE BEGIN

//class Node of Objects
public class Node{
    private Object data;
    private Node next;

    //constructor
    public Node(Object d, Node n){
        data = d;
        next = n;
    }

    //get and set methods
    public Object getData(){ return data;}
    public Node getNext(){ return next;}
    public void setData(Object o){ data = o;}
    public void setNext(Node n){ next = n; }

    //toString method
    public String toString(){
        return (String) data + "-->";
    }
}

// FREEZE CODE END
