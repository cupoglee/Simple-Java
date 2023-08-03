import java.io.*;
import java.util.*;

public class threedigit {
    public static void main(String[] args) {
        Scanner omg = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a 3-digit number or not.");
        int r = omg.nextInt();
        int k = 0, g;
        g = r;
        while (g > 0) {
            g = g / 10;
            k++;
        }
        if (k == 3)

            System.out.println("The given number " + r + " is a 3-digit number.");

        else
            System.out.println("No, The given number " + r + " is a " + k + "-digit number.");
    }

}
