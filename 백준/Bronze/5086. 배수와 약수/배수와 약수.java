import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(N == 0 && K == 0){
                break;
            }
       
            if(K / N != 0 && K % N == 0){
                System.out.println("factor");
            }else if(N / K != 0 && N % K == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }

        sc.close();
    }
}