import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M, i, j, k;
        N = sc.nextInt();
        M = sc.nextInt();

        int[] basket = new int[N];
        for (int l = 0; l < M; l++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();

            while (i <= j) {
                basket[i-1] = k;
                i++;
            }
        }

        for (int l = 0; l < basket.length; l++) {
            System.out.print(basket[l] + " ");
        }

        sc.close();
    }
}
