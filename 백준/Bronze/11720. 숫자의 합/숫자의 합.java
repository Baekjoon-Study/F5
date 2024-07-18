import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();

        String num;
        char on;
        num = sc.next();

        int total = 0;
        for (int i = 0; i < N; i++) {
            on = num.charAt(i);
            total += Integer.parseInt(String.valueOf(on));
        }

        System.out.println(total);

        sc.close();
    }
}
