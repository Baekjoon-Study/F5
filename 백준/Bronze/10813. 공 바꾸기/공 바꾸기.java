import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, i, j, temp;
        N = sc.nextInt();
        M = sc.nextInt();

        int[] basket = new int[N];
        for (int l = 0; l < N; l++) {
            basket[l] = l + 1;
        }
        

        for (int k = 0; k < M; k++) {
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            
            temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for (int k = 0; k < basket.length; k++) {
            System.out.print(basket[k] + " ");
        }
        System.out.println();

        sc.close();
    }
}
