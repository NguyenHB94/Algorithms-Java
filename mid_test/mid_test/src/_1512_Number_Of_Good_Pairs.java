public class _1512_Number_Of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int[] nums1 = {1,1,1,1};
        int[] nums2 = {1,2,3};

        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));

    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int rs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    rs ++;
                }
            }
        }

        return rs;
    }
}
