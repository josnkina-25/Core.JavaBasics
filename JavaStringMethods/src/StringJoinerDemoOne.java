import java.util.StringJoiner;
public class StringJoinerDemoOne {
    public static void main(String[] args){
        StringJoiner joinerNames = new StringJoiner(", ", "[", "]"); // passing comma( ,) as delimiter
        // adding values to StringJoiner
        joinerNames.add("Java");
        joinerNames.add("Python");
        joinerNames.add("C sharp");
        joinerNames.add("Javascript");
        System.out.println(joinerNames);
    }
}
