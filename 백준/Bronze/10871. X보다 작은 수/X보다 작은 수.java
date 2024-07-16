import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, X;
        N = sc.nextInt();
        X = sc.nextInt();

        int[] A = new int[N];
        int i = 0;

        for (int j = 0; j < N; j++) {
            A[j] = sc.nextInt();
        }

        for (int j = 0; j < N; j++) {
            if(A[j] < X){
                System.out.print(A[j] + " ");
            }
        }

        
        sc.close();

        
    }
}
