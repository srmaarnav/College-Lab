import java.util.Scanner;

public class SortColors {

    // Function to sort the array using the Dutch National Flag algorithm
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        // Traverse through the array with mid pointer
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], then increment both pointers
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Just move the mid pointer
                mid++;
            } else {
                // Swap nums[mid] and nums[high], then decrement high pointer
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Helper function to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Taking input for the array elements (only 0's, 1's, and 2's)
        System.out.println("Enter the elements of the array (only 0's, 1's, and 2's):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Sort the array
        sortColors(nums);

        // Output the sorted array
        System.out.println("Sorted array:");
        printArray(nums);

        scanner.close();
    }
}
