import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 5000;

        for (int i = 0; i <= N; i+=3) {
            int n = N - i;
            int total = 0;
            if(n/5 != 0 && n%5 == 0){
                total = n/5 + i/3;
                if(total < result){
                    result = total;
                }
            }
        }

        if(result == 5000){
            if(N/3 != 0 && N%3 == 0){
                System.out.println(N/3);
            }else{
                System.out.println(-1);
            }
        }else{
            System.out.println(result);
        }

        sc.close();
    }
}