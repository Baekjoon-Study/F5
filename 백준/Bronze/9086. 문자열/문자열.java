import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        String test;
        for (int i = 0; i < T; i++) {
            test = sc.next();
            char first = test.charAt(0);
            char last = test.charAt(test.length()-1);
            System.out.print(first);
            System.out.println(last);
        }
        sc.close();
    }
}
