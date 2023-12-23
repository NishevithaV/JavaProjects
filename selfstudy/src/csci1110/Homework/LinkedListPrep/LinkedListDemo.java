package csci1110.Homework.LinkedListPrep;
import csci1110.Homework.LinkedListPrep.LinkedList;

import java.util.Scanner;
public class LinkedListDemo {
    public static void main (String [] args){
// WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);

        LinkedList list1 = new LinkedList();

        int numOne = sc.nextInt();

        for(int i=0; i<numOne; i++){
            list1.addToEnd(sc.next());
        }

        list1.enumerate();
        String searchString = sc.next();
        int occur = list1.countWord(searchString);
        if (occur == -1){
            occur = 0;
        }
        System.out.println("\n"+searchString+" is in the list "+occur+" times");
        System.out.println(searchString+" last occurrence is at position "+list1.lastIndexOf(searchString));

        int removalCount = list1.remove(searchString);
        System.out.println(searchString+" is removed "+removalCount+" times");
        System.out.println("List size: "+list1.size());

        list1.enumerate();

        LinkedList list2 = new LinkedList();

        int numTwo = sc.nextInt();

        for(int i=0; i<numTwo; i++){
            list2.addToEnd(sc.next());
        }

        LinkedList list3 = list1.interweave(list2);
        System.out.println();
        System.out.println();
        list3.enumerate();

    }
}
