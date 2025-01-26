import java.util.Scanner;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // Merge the two arrays
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // If there are remaining elements in nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // If there are remaining elements in nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        // for(int p=0;p<merged.length;p++){
        //     System.out.println(merged[p]);
        // }
        // Find the median
        int totalLength = m + n;
        if (totalLength % 2 == 1) {
            // Odd length, return the middle element
            return merged[totalLength / 2];
        } else {
            // Even length, return the average of the two middle elements
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first sorted array
        System.out.print("Enter the number of elements in the first array: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter the elements of the first array (sorted):");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Taking input for the second sorted array
        System.out.print("Enter the number of elements in the second array: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter the elements of the second array (sorted):");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Calculate and print the median
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median of the two sorted arrays is: " + median);

        scanner.close();
    }
}
