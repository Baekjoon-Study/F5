import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();


        for (int n = n0; n <= 100; n++) {
            int fn = a1*n + a0;
            int gn = c * n;
            
            if(fn > gn){
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);

        sc.close();
    }
}