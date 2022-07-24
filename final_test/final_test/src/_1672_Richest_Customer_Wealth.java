public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {

        int[][] accounts = {{2,8,7},{7,1,3},{1,5,9}};

        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (max < sum) max = sum;
        }
        return max;
    }
}
