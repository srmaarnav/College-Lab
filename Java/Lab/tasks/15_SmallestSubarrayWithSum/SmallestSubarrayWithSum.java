import java.util.Scanner;

public class SmallestSubarrayWithSum {

    public static int smallestSubarrayWithSum(int[] nums, int target) {
        int n = nums.length;
        int minLength = n + 1; // Initialize to a large value
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += nums[end]; // Add the current element to the sum

            // Shrink the window if the current sum is greater than or equal to target
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= nums[start]; // Remove the element at the start of the window
                start++; // Shrink the window from the left
            }
        }

        // If minLength is still n+1, no valid subarray was found
        return minLength == n + 1 ? 0 : minLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Taking input for the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Find and print the length of the smallest subarray
        int result = smallestSubarrayWithSum(nums, target);
        if (result == 0) {
            System.out.println("No subarray with sum greater than or equal to target was found.");
        } else {
            System.out.println("The length of the smallest subarray with sum >= " + target + " is: " + result);
        }

        scanner.close();
    }
}
