import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}