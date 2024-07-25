import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int cent = sc.nextInt();

            int q = cent / 25;
            cent %= 25;

            int d = cent / 10;
            cent %= 10;

            int n = cent / 5;
            cent %= 5;

            int p = cent / 1;

            System.out.println(q + " " + d + " " + n + " " + p);
        }

        sc.close();
    }
}