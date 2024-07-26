import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i;
        for (i = 0; i < N; i++) {
            N -= i;
        }
        if(i % 2 == 0){
            System.out.println(N + "/" + (i + 1 - N));
        }else{
            System.out.println((i + 1 - N) + "/" + N);
        }

        sc.close();
    }
}