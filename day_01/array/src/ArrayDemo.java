import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result = insertByIndex(array, 8,4);
        System.out.println(Arrays.toString(result));

        int n = delete(result, 3);
        for (int i = 0; i < n; i++){
            System.out.print(result[i] + "\t");
        }
    }

    public static int[] insert(int[] arr, int x) {
        int[] result = new int[arr.length+1];
        for(int i = 0; i < result.length; i ++) {
            if(i != (result.length -1)) {
                result[i] = arr[i];
            } else {
                result[i] = x;
            }
        }
        return result;
    }

    public static int[] insertByIndex(int[] arr, int x, int position) {
        int[] result = Arrays.copyOf(arr, arr.length + 1);
        if(position > arr.length - 1 || position < 0){
            System.out.println("Position not found");
        }
        for (int i = arr.length; i > position; i --){
                result[i] = arr[i -1];
            }
        result[position] = x;
        return result;
    }

    public static int delete(int[] arr, int x) {
        int n = arr.length;
        int[] result = new int[n-1];
        int position = -1;
        for (int i = 0; i < n; i ++) {
            if (arr[i] == x){
                position = i;
            }
        }
        if(position == -1) {
            return n;
        }
        for (int i = position; i < arr.length - 1; i ++) {
            arr[i] = arr[i+1];
        }

        return n - 1;
    }
}
