import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dot = 2;
        for (int i = 0; i < N; i++) {
            dot += Math.pow(2, i);
        }
        System.out.println(dot*dot);

        sc.close();
    }
}