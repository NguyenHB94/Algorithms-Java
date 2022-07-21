public class _1266_Leetcode {

    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        boolean result = arrayStringsAreEqual(word1,word2);
        System.out.println(result);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String w1 : word1) {
            s1.append(w1);
        }

        for(String w2 : word2) {
            s2.append(w2);
        }

       return s1.toString().equals(s2.toString());
    }

}
