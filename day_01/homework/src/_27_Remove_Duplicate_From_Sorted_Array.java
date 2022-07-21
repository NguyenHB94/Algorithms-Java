import java.lang.reflect.Array;
import java.util.Arrays;

public class _27_Remove_Duplicate_From_Sorted_Array {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,4,5,5,6};
        int k = removeDuplicates(numbers);
        System.out.println(k);
        System.out.println(Arrays.toString(numbers));

    }

    public static int removeDuplicates(int[] nums) {
        int compare = nums[0];
        int k = 1;

        for (int i = 1; i < nums.length; i ++) {

            if (nums[i] != compare) {
                nums[k] = nums[i];
                k ++;
                compare = nums[i];
            }

        }
        return k;
    }
}
