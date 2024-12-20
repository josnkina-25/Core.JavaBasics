import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        //Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

        // Find the index of the first occurence of an element in an ArrayList
        System.out.println("indexOf \"Steve\" is " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\" is " + names.indexOf("Mark"));

        // Find the index of the last occurence of an element in ArrayList
        System.out.println("lastIndexOf \"John\" is " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" is " + names.lastIndexOf("Bill"));

    }
}
