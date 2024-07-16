import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();
        
        int m = 1000000;
        int M = -1000000;
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(m>A[i]){m = A[i];}
            if(M<A[i]){M = A[i];}
        }

        System.out.print(m+ " ");
        System.out.println(M);
        
        sc.close();

        
    }
}
