import java.io.*;
import java.util.Scanner; //To print fibonacci series upto the limits given by the user

public class fibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1;
        int c, k, r;
        Scanner phew = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you need?");
        k = phew.nextInt();
        System.out.print("0" + ", " + "1" + ", ");
        r = k - 2;
        for (int i = 1; i <= r; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }

    }

}
