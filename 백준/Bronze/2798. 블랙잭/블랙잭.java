import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] black = new int[N];
        for (int i = 0; i < N; i++) {
            black[i] = sc.nextInt();
        }

        Arrays.sort(black);
        int max = 0;

        for (int i = 0; i < black.length; i++) {
            for (int j = i + 1; j < black.length; j++) {
                for (int k = j + 1; k < black.length; k++) {
                    int exp = black[i] + black[j] + black[k];

                    if(exp > max && M >= exp){
                        max = exp;
                    }
                }
            }
        }

        System.out.println(max);

        sc.close();
    }
}