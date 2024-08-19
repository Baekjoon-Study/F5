import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] N_list = new int[N];

        int total_change = 0;
        for (int i = 0; i < N; i++) {
            N_list[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if(N_list[j] == N_list[i]){
                    total_change++;
                    break;
                }
            }
        }

        System.out.println(total_change);
        sc.close();
    }
}
