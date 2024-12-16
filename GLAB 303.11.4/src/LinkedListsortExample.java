import java.util.*;
public class LinkedListsortExample {
    public static void main(String[] args) {
        // create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

// unsorted
         System.out.println(linkedList);
//1. Sort the list
        Collections.sort(linkedList);
//Sorted
        System.out.println(linkedList);
//2. Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());
//Custom sorted
        System.out.println(linkedList);
    }
}
