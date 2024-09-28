public class KthNumber {

    public static int KthNumber(int[] nums, int k) {

        int temp = 0;
        for (int i =0; i<nums.length; i++){
            for (int j = i +1; j< nums.length; j++){
                if(nums[j] > nums[i]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;


                }

            }

        }
        return nums[k - 1];
    }
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(KthNumber.KthNumber(nums1, k1));

        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println(KthNumber.KthNumber(nums2,k2));

    }
}
