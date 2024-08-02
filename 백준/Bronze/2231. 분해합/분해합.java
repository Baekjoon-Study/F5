import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int num = i;
            int sum = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum == N){
                result = i;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}