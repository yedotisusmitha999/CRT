
public class RemoveMinExample {
    public static void main(String[] args) {
        // Create a min heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Insert values into the min heap
        int[] values = {30, 10, 50, 20, 5};
        for (int val : values) {
            minHeap.add(val);
        }
        // Remove and print the minimum element until the heap is empty
        System.out.println("Removing elements in ascending order:");
        while (!minHeap.isEmpty()) {
            int min = minHeap.poll(); // poll() removes and returns the min element
            System.out.print(min + " ");
        }
    }
}
