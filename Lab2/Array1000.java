public class Array1000 {
    public static void main(String[] args) {
        int length = 1000;
        int[] numbers = new int[length];

        // Fill the array with integers
        for (int index = 0; index < length; index++) {
            numbers[index] = index;
        }

        // Reading the last element by index
        long startTime = System.nanoTime();
        int lastElement = numbers[length - 1];
        long endTime = System.nanoTime();
        System.out.println("Time taken to read by index: " + (endTime - startTime) + " nanoseconds");

        // Search for a specific value 
        startTime = System.nanoTime();
        boolean exists = false;
        for (int index = 0; index < length; index++) {
            if (numbers[index] == 999) {
                exists = true;
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to search by value: " + (endTime - startTime) + " nanoseconds");

        // Insert an element at the head
        startTime = System.nanoTime();
        int[] newNumbersHead = new int[length + 1];
        newNumbersHead[0] = 1001;
        for (int index = 0; index < length; index++) {
            newNumbersHead[index + 1] = numbers[index];
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the head: " + (endTime - startTime) + " nanoseconds");

        // Insert an element in the middle
        startTime = System.nanoTime();
        int middle = length / 2;
        int[] newNumbersMid = new int[length + 1];
        for (int index = 0; index < middle; index++) {
            newNumbersMid[index] = numbers[index];
        }
        newNumbersMid[middle] = 1001;
        for (int index = middle; index < length; index++) {
            newNumbersMid[index + 1] = numbers[index];
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to insert in the middle: " + (endTime - startTime) + " nanoseconds");

        // Insert an element at the tail
        startTime = System.nanoTime();
        int[] newNumbersTail = new int[length + 1];
        for (int index = 0; index < length; index++) {
            newNumbersTail[index] = numbers[index];
        }
        newNumbersTail[length] = 1001;
        endTime = System.nanoTime();
        System.out.println("Time taken to insert at the tail: " + (endTime - startTime) + " nanoseconds");

        // Delete from the head
        startTime = System.nanoTime();
        int[] afterDeleteHead = new int[length - 1];
        for (int index = 0; index < length - 1; index++) {
            afterDeleteHead[index] = numbers[index + 1];
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the head: " + (endTime - startTime) + " nanoseconds");

        // Delete from the middle
        startTime = System.nanoTime();
        int[] afterDeleteMid = new int[length - 1];
        for (int index = 0; index < middle; index++) {
            afterDeleteMid[index] = numbers[index];
        }
        for (int index = middle; index < length - 1; index++) {
            afterDeleteMid[index] = numbers[index + 1];
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the middle: " + (endTime - startTime) + " nanoseconds");

        // Delete from the tail
        startTime = System.nanoTime();
        int[] afterDeleteTail = new int[length - 1];
        for (int index = 0; index < length - 1; index++) {
            afterDeleteTail[index] = numbers[index];
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to delete from the tail: " + (endTime - startTime) + " nanoseconds");
    }
}
