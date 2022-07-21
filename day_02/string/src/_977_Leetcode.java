public class _977_Leetcode {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans =new int[n];
        int x = 0,y = n-1, i = n-1;
        while(x<=y){
            int left = nums[x] * nums[x];
            int right = nums[y] * nums[y];
            if(left < right){
                ans[i] = right;
                y--;
            } else{
                ans[i] = left;
                x++;
            }

            i--;
        }
        return ans;
    }
}
