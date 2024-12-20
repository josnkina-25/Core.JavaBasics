import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");
        programmingLanguages.add("C");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial list: " + programmingLanguages);
        // Remove the elements at index 5
        programmingLanguages.remove(5);
        System.out.println("After removing (5): " + programmingLanguages);

        // Remove the first occurence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Java");
        System.out.println("After remove (\"Java\"): " + programmingLanguages);

        // Remove all the elements that exists in a give collection

        List<String>ScriptingLanguages = new ArrayList<>();
        ScriptingLanguages.add("Python");
        ScriptingLanguages.add("Ruby");
        ScriptingLanguages.add("C++");

        programmingLanguages.removeAll(ScriptingLanguages);
        System.out.println("After removingAll (ScriptingLanguages): " + programmingLanguages);
        // remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}
