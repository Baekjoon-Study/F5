import java.util.*;
import java.io.*;
public class Main {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        if(n == 2){
            return true;
        }

        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int total = 0;
        
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if(isPrime(n)){
                total++;
            }
        }
        System.out.println(total);

        sc.close();
    }
}