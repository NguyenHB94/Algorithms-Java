public class Demo {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int x) {
        int n = arr.length;
        int iLeft = 0;
        int iRight = n - 1;

        while (iLeft <= iRight) {
            int key = (iLeft + iRight) / 2;

            if (arr[key] == x) {
                return  key;
            } else if (arr[key] < x) {
                iLeft = key + 1;

            }
        }
    }
}
