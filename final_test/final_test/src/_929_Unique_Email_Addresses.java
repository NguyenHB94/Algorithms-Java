import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _929_Unique_Email_Addresses {
    public static void main(String[] args) {
        String[] email = {"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};

        int rs = numUniqueEmails(email);
        System.out.println(rs);


//        String str = "test.email+alex@leetcode.com";
//        System.out.println(convertLocalName(str));

    }

    public static int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < emails.length; i++){
            emails[i] = convertLocalName(emails[i]);
            if (!list.contains(emails[i])) {
                list.add(emails[i]);
            }
        }

        return list.size();
    }

    public static String convertLocalName(String email) {
        String localName = email.substring(0, email.indexOf("@"));

        if (localName.contains(".")) {
            email = localName.replace(".","") + email.substring(email.indexOf("@"));
        }

        if (localName.contains("+")) {
            email = email.substring(0,email.indexOf("+")) + email.substring(email.indexOf("@"));
        }

        return email;
    }
}
