public class _1598_Crawler_Log_Folder {
    public static void main(String[] args) {

        String[] logs = {"d1/","d2/","../","d21/","./"};
        String[] logs1 = {"d1/","d2/","./","d3/","../","d31/"};
        String[] logs3 = {"d1/","../","../","../"};
        System.out.println(minOperations(logs3));

    }

    public static int minOperations(String[] logs) {
        int rs = 0;
        for (int i = 0; i < logs.length; i ++) {
            if (logs[i].equals("../")) {
               if (rs > 0) {
                   rs -= 1;
               }
            } else if (!logs[i].equals("./") && !logs[i].equals("../")) {
                rs += 1;
            }
        }

        return rs;
    }

}
