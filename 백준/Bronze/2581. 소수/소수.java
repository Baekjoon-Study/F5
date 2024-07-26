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
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        int min = 0, total = 0;

        for (int i = M; i <= N; i++) {
            if(isPrime(i)){
                if(total == 0){
                    min = i;
                }
                total += i;
            }
        }

        if (total == 0) {
            total = -1;
            System.out.println(total);
        }else{
            System.out.println(total);
            System.out.println(min);
        }

        sc.close();
    }
}