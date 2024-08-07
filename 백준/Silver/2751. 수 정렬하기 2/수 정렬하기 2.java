import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int[] upper = new int[N];

        for (int i = 0; i < N; i++) {
            upper[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(upper);

        for (int i = 0; i < N; i++) {
            bw.write(upper[i]+"\n");
        }

        bw.flush();
        bw.close();
    }
}