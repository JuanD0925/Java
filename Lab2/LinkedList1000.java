import java.util.LinkedList;

public class LinkedList1000 {
    public static void main(String[] args) {
        int length = 1000;
        LinkedList<Integer> list = new LinkedList<>();

        // Fill the LinkedList with integers
        for (int index = 0; index < length; index++) {
            list.add(index);
        }

        // Read the last element by index
        long start = System.nanoTime();
        int lastValue = list.get(length - 1);
        long end = System.nanoTime();
        System.out.println("Time taken to read by index: " + (end - start) + " nanoseconds");

        // Search for a value 
        start = System.nanoTime();
        boolean isFound = list.contains(999);
        end = System.nanoTime();
        System.out.println("Time taken to search by value: " + (end - start) + " nanoseconds");

        // Insert element at the head
        start = System.nanoTime();
        list.addFirst(1001);
        end = System.nanoTime();
        System.out.println("Time taken to insert at the head: " + (end - start) + " nanoseconds");

        // Insert element in the middle
        start = System.nanoTime();
        int middle = length / 2;
        list.add(middle, 1002);
        end = System.nanoTime();
        System.out.println("Time taken to insert in the middle: " + (end - start) + " nanoseconds");

        // Insert element at the tail
        start = System.nanoTime();
        list.addLast(1003);
        end = System.nanoTime();
        System.out.println("Time taken to insert at the tail: " + (end - start) + " nanoseconds");

        // Delete element from the head
        start = System.nanoTime();
        list.removeFirst();
        end = System.nanoTime();
        System.out.println("Time taken to delete from the head: " + (end - start) + " nanoseconds");

        // Delete element from the middle
        start = System.nanoTime();
        list.remove(middle);
        end = System.nanoTime();
        System.out.println("Time taken to delete from the middle: " + (end - start) + " nanoseconds");

        // Delete element from the tail
        start = System.nanoTime();
        list.removeLast();
        end = System.nanoTime();
        System.out.println("Time taken to delete from the tail: " + (end - start) + " nanoseconds");
    }
}
