import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<String>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? " + topCompanies.isEmpty());
        topCompanies.add("Microsoft");
        topCompanies.add("Apple");
        topCompanies.add("Google");
        topCompanies.add("Facebook");
        topCompanies.add("Amazon");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        // retrieve the element at a give index

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best company: " + bestCompany);
        System.out.println("Second Best company: " + secondBestCompany);
        System.out.println("Last company: " + lastCompany);

        // Modify the element at a given index
        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies: " + topCompanies);
    }
}
