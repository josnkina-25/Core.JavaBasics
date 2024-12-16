import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExampletwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);

        // using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);
        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Is all elements removed? " + value2);


    }
}
