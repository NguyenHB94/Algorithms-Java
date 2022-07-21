public class DemoRecursion {
    public static void main(String[] args) {
        //int rs = giaithua(3);
        //System.out.println(rs);
        System.out.println(fibonaci(5));

    }

//    public static void recursion() {
//        System.out.println("Đệ quy");
//        recursion();
//    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int giaithua(int n) {
        if (n <= 1) {
            return 1;
        }
        int rs = 1;
        for (int i = 2; i <= n; i++) {
            rs *= i;
        }
        return rs;
    }

    public static int fibonaci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);

    }

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }
}
