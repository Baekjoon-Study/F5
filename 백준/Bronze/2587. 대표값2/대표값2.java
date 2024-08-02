import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = 5;
        int[] inu = new int[N];
        int total = 0;

        for (int i = 0; i < N; i++) {
            inu[i] = sc.nextInt();
            total += inu[i];
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(inu[i] >= inu[j]){
                    int temp = inu[i];
                    inu[i] = inu[j];
                    inu[j] = temp;
                }
            }
        }

        System.out.println(total/5);
        System.out.println(inu[2]);

        sc.close();
    }
}