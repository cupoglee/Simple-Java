import java.io.*;

public class technumber {
    public static void main(String args[]) {
        int p, q, n, r;
        System.out.println("The tech numbers are -");
        for (int i = 1000; i <= 9999; i++) {
            p = i % 100;
            q = i / 100;

            n = p + q;
            r = (int) Math.pow(n, 2);
            if (r == i) {
                System.out.println(r);
            }
        }
    }

}
