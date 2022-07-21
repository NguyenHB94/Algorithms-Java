import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,7,8,0,0,0};
        int[] nums2 = {2,5,6};

        merge1(nums1, 3, nums2, 3);


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int add = 0;
        for(int i = m; i < m + n; i ++) {
            nums1[i] = nums2[add];
            add ++;
        }
        Arrays.sort(nums1);
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (k >= 0) {
            if(j < 0){
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
