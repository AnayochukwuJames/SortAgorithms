public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                     temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in descending order:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        return nums[k - 1];
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("The " + k1 + "-th largest element is: "
                + findKthLargest(nums1, k1));

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("The " + k2 + "-th largest element is: "
                + findKthLargest(nums2, k2));
    }
}
