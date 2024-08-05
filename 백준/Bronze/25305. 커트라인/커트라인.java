import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] inu = new int[N];

        for (int i = 0; i < N; i++) {
            inu[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(inu[i] <= inu[j]){
                    int temp = inu[i];
                    inu[i] = inu[j];
                    inu[j] = temp;
                }
            }
        }

        System.out.println(inu[k-1]);

        sc.close();
    }
}