import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A_B = st.nextToken() + st.nextToken();
        String C_D = st.nextToken() + st.nextToken();

        long total = Long.parseLong(A_B) + Long.parseLong(C_D);
        bw.write(String.valueOf(total));

        bw.flush();
        bw.close();
    }
}