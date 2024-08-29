import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] tail = str.split("");

        for (int i = 0; i < str.length(); i++) {
            tail[i] = str.substring(i, str.length());
        }

        Arrays.sort(tail);

        for (String t : tail) {
            bw.write(t + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}