import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        total = sc.nextInt();
        int[] A = new int[total];
        int[] B = new int[total];
        for (int i = 0; i < total; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < total; i++) {
            System.out.println(A[i] + B[i]);
        }

        sc.close();
    }
}
