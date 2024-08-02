import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        
        System.out.print((c*e - f*b)/(a*e - b*d) + " ");
        System.out.println((c*d - a*f)/(b*d - a*e));

        sc.close();
    }
}