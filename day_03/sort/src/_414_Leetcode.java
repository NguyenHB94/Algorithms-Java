import java.util.Arrays;

public class _414_Leetcode {
    public static void main(String[] args) {
        int [] nums = {2,2,3,1};
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        for (int i = n -1; i > 0; i --) {
            if (nums[i] == nums[i - 1]) {
                count ++;
            }
        }
        int result;
        if (n >= 3) {
            result = nums[n -3];
        }
        result = nums[n-1];
        System.out.println(result);

    }

}
