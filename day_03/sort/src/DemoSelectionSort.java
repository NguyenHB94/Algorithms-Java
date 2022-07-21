import java.util.Arrays;

public class DemoSelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,5};

        int[] sortArr = sort(arr);

        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
