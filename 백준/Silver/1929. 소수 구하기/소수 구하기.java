import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        
        isPrime(start, end, bw);

        bw.flush();
        bw.close();
    }

    static void isPrime(int a, int b, BufferedWriter bw)throws IOException{
        boolean[] is_prime = new boolean[b + 1];
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;

        for (int i = 2; i <= b; i++) {
            if(is_prime[i]){
                int j = 2;
                while(i * j <= b){
                    is_prime[i * j] = false;
                    j++;
                }
            }
        }

        for (int i = a; i <= b; i++) {
            if(is_prime[i]){
                bw.write(i + "\n");
            }
        }
    }
}