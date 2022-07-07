public class _724_Find_Pivot_Index {
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum - nums[0] == 0) {
            return 0;
        }
        int sumL = 0;
        for (int i = 0; i < n - 1; i++) {
            sumL += nums[i];
            if (sumL == sum - sumL - nums[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}
