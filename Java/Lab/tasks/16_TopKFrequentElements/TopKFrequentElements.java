import java.util.*;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element using a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a PriorityQueue (min-heap) to store the top k frequent elements
        // The priority queue is ordered by frequency in ascending order
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>( 
            (a, b) -> a.getValue() - b.getValue() // Compare by frequency (value)
        );

        // Step 3: Add all entries to the priority queue
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            // If the size exceeds k, remove the least frequent element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Extract the elements from the heap and store them in the result list
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Since the heap gives the smallest element first, we reverse the result to get the top k frequent elements
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array and the number of top frequent elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Find the top k frequent elements
        List<Integer> topK = topKFrequent(nums, k);
        System.out.println("The top " + k + " frequent elements are: " + topK);

        scanner.close();
    }
}
