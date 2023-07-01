import java.io.*;
import java.util.Scanner;

class wap1 // Accept 10 numbers and stop the program if more than 4 even numbers have been
           // entered.
{
    public static void main(String args[]) {
        int n, k, evencount = 0, count = 0;
        Scanner im = new Scanner(System.in);
        System.out.println("Enter max 10 numbers.");
        for (int i = 1; i <= 10; i++) {
            n = im.nextInt();
            k = n % 2;
            if (k == 0) {
                evencount++;

            }
            count++;
            if (count > 10 || evencount > 3) {
                break;
            }
        }
    }

}
