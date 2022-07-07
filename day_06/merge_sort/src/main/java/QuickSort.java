import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {25,30,45,6,11,90,15};
        sort(nums, 0, nums.length - 1);
    }

    public static void sort(int[] nums,int iLeft,int iRight) {
        // Điều kiện dừng
        if (iLeft == iRight) {
            return;
        }

        // Chọn khoá
        int iMid = (iLeft + iRight) / 2;
        int key = nums[iMid];

        //Phân bố mảng theo key và lấy giá trị chốt pivot
        int pivot = partition(nums, iLeft, iRight, key);
        System.out.println(pivot);

        sort(nums, iLeft, pivot - 1);
        sort(nums, pivot, iRight);

    }

    public static int partition(int[] nums, int iLeft, int iRight, int key) {
        int iL = iLeft;
        int iR = iRight;

        while (iL < iR) {
            while (nums[iL] < key) {
                iL ++;
            }
            while (nums[iR] > key) {
                iR --;
             }

            if (iL <= iR) {
                System.out.println("swap: " + iL + "-" + iR);
                int temp = nums[iL];
                nums[iL] = nums[iR];
                nums[iR] = temp;
                iL ++;
                iR --;
            }
            System.out.println(Arrays.toString(nums));
        }
        return iL;
    }


}
