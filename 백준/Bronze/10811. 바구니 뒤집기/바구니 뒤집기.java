import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, i, j, temp;
        N = sc.nextInt();
        M = sc.nextInt();

        int[] basket = new int[N];
        for (int k = 0; k < basket.length; k++) {
            basket[k] = k + 1;
        }

        for (int k = 0; k < M; k++) {
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            
            while(i < j){
                temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }
        
        for (int k = 0; k < basket.length; k++) {
            System.out.print(basket[k] + " ");
        }

        sc.close();
    }
}