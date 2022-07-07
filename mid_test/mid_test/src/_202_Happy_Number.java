public class _202_Happy_Number {
    public static void main(String[] args) {

        int n = 19;
        System.out.println(isHappy(n));

    }

    public static boolean isHappy(int n) {
        while (n >= 10) {
            int m = n;
            n = 0;
            while (m != 0) {
                n += Math.pow((m % 10),2);
                m /= 10;
            }
        }
        return n == 1 || n == 7; // n == 7 là trương hợp đặc biệt
    }
}
