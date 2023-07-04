import java.io.*;
import java.util.Scanner;

public class months {
    public static void main(String args[]) {
        int inputDays, days, months;
        Scanner im = new Scanner(System.in);
        System.out.println("Enter the number of days to be converted.");
        inputDays = im.nextInt();

        months = inputDays / 30;
        days = inputDays % 30;
        System.out.println("Months - " + months);
        System.out.println("Days - " + days);

    }

}
