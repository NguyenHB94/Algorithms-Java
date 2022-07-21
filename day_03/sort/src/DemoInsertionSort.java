import java.util.Arrays;

public class DemoInsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,5};

        int[] sortArr = sort(arr);

        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }
}
