import java.io.*;

public class pat3 {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i = i + 2) {
            for (int j = 1; j <= i; j = j + 2) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
