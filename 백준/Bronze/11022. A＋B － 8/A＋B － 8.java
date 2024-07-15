import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int number;
        number = sc.nextInt();
        int[] A = new int[number];
        int[] B = new int[number];
        
        for (int i = 0; i < number; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Case #" + i + ": " + A[i-1] + " + " + B[i-1] + " = " + (A[i-1]+B[i-1]));
        }
        

        sc.close();
    }
}
