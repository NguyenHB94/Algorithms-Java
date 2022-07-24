import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442_Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1,9,9,10,10};

        List<Integer> rs = findDuplicates(nums);
        System.out.println(Arrays.toString(rs.toArray()));

    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i+1]){
                list.add(nums[i]);
                i++;
            }
        }
        return list;
    }
}
