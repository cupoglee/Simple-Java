import java.io.*;

public class pat4 {
    public static void main(String args[]) {
        int k;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                k = j % 2;
                if (k == 0)
                    System.out.print("0" + " ");
                else
                    System.out.print("1" + " ");

            }
            System.out.println();
        }
    }

}
