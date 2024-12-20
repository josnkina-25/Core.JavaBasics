import java.util.TreeMap;
public class ExampleTreemapOne {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters

        boolean result = numbers.remove("three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);
    }
}


