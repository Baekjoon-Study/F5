import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println(3);
     
        sc.close();
    }
}