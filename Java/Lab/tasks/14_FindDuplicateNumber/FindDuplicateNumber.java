import java.util.Scanner;

public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        // Step 1: Finding the intersection point in the cycle
        int slow = nums[0];
        int fast = nums[0];
        
        // The cycle detection loop
        do {
            slow = nums[slow];         // move slow by 1 step
            fast = nums[nums[fast]];   // move fast by 2 steps
        } while (slow != fast); // they meet inside the cycle
        
        // Step 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0]; // reset slow pointer to the start
        while (slow != fast) {
            slow = nums[slow]; // move slow by 1 step
            fast = nums[fast]; // move fast by 1 step
        }
        
        // slow and fast now point to the duplicate number
        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array size (n+1 elements)
        System.out.print("Enter the number of elements in the array (n+1): ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n + 1];
        
        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array (between 1 and n):");
        for (int i = 0; i < n + 1; i++) {
            nums[i] = scanner.nextInt();
        }

        // Finding the duplicate number
        int duplicate = findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);

        scanner.close();
    }
}
