import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
         int n = 0;
         while (true) {
            n = sc.nextInt();
            if(n == -1){
                break;
            }

            if(n == 1){
                System.out.println(n + " is NOT perfect.");
                continue;
            }
            
            int[] n_array = new int[n];
            int n_idx = 0, total = 0;

            for (int i = 1; i <= n/2; i++) {
                if(n%i == 0){
                    n_array[n_idx] = i;
                    n_idx++;
                    total += i;
                }
            }
            if(n == total){
                System.out.print(n + " = ");
                for (int j = 0; j < n_idx-1; j++) {
                    System.out.print(n_array[j] + " + ");                    
                }
                System.out.println(n_array[n_idx-1]);
            }else{
                System.out.println(n + " is NOT perfect.");
            }
         }

        sc.close();
    }
}