import java.util.HashSet;
import java.util.Set;

public class HashSet1000 {
    public static void main(String[] args) {
        int count = 1000;
        Set<Integer> numberSet = new HashSet<>();

        // Populate the set with integers
        for (int i = 0; i < count; i++) {
            numberSet.add(i);
        }

        // Search for a value 
        long start = System.nanoTime();
        boolean isFound = numberSet.contains(999);
        long end = System.nanoTime();
        System.out.println("Time taken to search by value: " + (end - start) + " nanoseconds");

        // Insert a new value into the set
        start = System.nanoTime();
        numberSet.add(1001);
        end = System.nanoTime();
        System.out.println("Time taken to insert: " + (end - start) + " nanoseconds");

        // Remove a specific value 
        start = System.nanoTime();
        numberSet.remove(999);
        end = System.nanoTime();
        System.out.println("Time taken to delete a value: " + (end - start) + " nanoseconds");
    }
}
