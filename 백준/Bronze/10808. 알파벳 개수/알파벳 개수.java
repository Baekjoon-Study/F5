import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] asc = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ch_asc = (int)ch - 97;
            asc[ch_asc]++;
        }

        for (int i : asc) {
            bw.write(i + " ");
        }


        bw.flush();
        bw.close();
    }
}