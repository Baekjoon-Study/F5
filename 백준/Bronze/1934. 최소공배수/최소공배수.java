import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int big = Math.max(A,B);
            int small = Math.min(A,B);

            int gcd = hoze(big, small);
            bw.write(String.valueOf(big * small /gcd) + "\n");
        }
        
        bw.flush();
        bw.close();
    }

    static int hoze(int a, int b){
        if(b == 0){
            return a;
        }
        return hoze(b, a % b);
    }
}