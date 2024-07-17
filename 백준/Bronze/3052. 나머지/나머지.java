import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        HashSet<Integer> H = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            H.add(A[i]%42);
        }

        System.out.println(H.size());
        
        sc.close();

        
    }
}
