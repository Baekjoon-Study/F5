import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int j = 0;

        for (int i = 1; i <= N; i++) {
            if(N % i == 0){
                j++;
            }
            if(j == K){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);

        sc.close();
    }
}