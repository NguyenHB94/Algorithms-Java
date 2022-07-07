import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] nums1 = {6,25,30,45};
//        int[] nums2 = {11,15,90};

        int[] nums = {25,30,45,6,11,90,15};
        int[] result = mergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(result));

    }

    public static int[] sortArray(int[] nums) {
        return null;
    }

    public static int[] mergeSort(int[] nums, int L, int R) {
        // Điều kiện dừng khi mảng chỉ có 1 phần tử
        if (L == R) {
            int[] singleElement = {nums[L]};
            return singleElement;
        }

        // Chia mảng
        int M = (L + R) / 2;
        int[] nums1 = mergeSort(nums, L, M);
        int[] nums2 = mergeSort(nums,M + 1, R);

        //Gộp mảng
        int[] result = merge(nums1, nums2);

        return result;
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] result = new  int[n];
        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while (i < n) {
            if (i1 < nums1.length && i2 < nums2.length) {
                if (nums1[i1] < nums2[i2]) {
                    result[i] = nums1[i1];
                    i1 ++;
                    i ++;
                } else {
                    result[i] = nums2[i2];
                    i2 ++;
                    i ++;
                }
            } else {

                if (i1 < nums1.length) {// Mảng nums1 != rỗng và mảng nums2 rỗng
                    result[i] = nums1[i1];
                    i1 ++;
                    i ++;
                } else { // Mảng nums1 rỗng mảng nums2 != rỗng
                    result[i] = nums2[i2];
                    i2 ++;
                    i ++;
                }
            }
        }

        return  result;
    }
}
