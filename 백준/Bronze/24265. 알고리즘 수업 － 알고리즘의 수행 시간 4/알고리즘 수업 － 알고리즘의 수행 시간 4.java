import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println((n-1) * n / 2);
        System.out.println(2);
     
        sc.close();
    }
}