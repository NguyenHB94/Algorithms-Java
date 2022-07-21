import java.util.Arrays;

public class _334_Leetcode {
    public static void main(String[] args) {
        String s = "hello";
        //reverse(s);
        System.out.println(reverse(s));


    }

    public void reverseString(char[] s) {

        for(int i = 0; i < s.length / 2; i ++) {
            char temp = s[i];
            s[i] = s[s.length -1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
