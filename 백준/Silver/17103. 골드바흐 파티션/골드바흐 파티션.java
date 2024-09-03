import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 1000000;
        boolean[] prim_list = new boolean[n+1];
        Arrays.fill(prim_list, true);
        prim_list[0] = prim_list[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(prim_list[i] == true){
                int j = 2;
                while (i * j <= 1000000) {
                    if(prim_list[i*j] == true){
                        prim_list[i*j] = false;
                    }
                    j++;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int total = 0;
            int t = Integer.parseInt(br.readLine());
            total = isPrime(t, total, prim_list);
            bw.write(total + "\n");
        }


        bw.flush();
        bw.close();
    }
    static int isPrime(int n, int total, boolean[] prim_list){
        for (int i = 2; i <= n/2; i++) {
            if(prim_list[i] == true && prim_list[n-i] == true){
                total++;
            }
        }
        return total;
    }
}