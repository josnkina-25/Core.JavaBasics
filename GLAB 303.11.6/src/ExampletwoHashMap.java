import java.util.HashMap;

public class ExampletwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();
        // Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains: " + newHashMap);
        // getting size HashMap
        System.out.println("Size of original MAp is: " + newHashMap.size());
        // copy contains of one HashMAp to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings = " + copyHashMap);

        // removal of null key

        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMAp null key value = " + nullKeyValue);
        System.out.println("copyHashMap  after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is: " + copyHashMap.size());
    }
}
