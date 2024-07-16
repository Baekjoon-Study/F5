import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = 9;
        
        int M = 0;
        int ind = 0;
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if(M < A[i]){
                M = A[i];
                ind = i;
            }
        }

        System.out.println(M);
        System.out.println(ind + 1);
        
        sc.close();

        
    }
}
