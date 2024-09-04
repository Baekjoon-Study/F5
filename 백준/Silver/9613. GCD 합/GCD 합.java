import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long total = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] s_list = new int[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < s_list.length; j++) {
                s_list[j] = Integer.parseInt(st.nextToken());
            }
            total = sort(s_list, total);
            bw.write(total + "\n");
        }

        bw.flush();
        bw.close();
    }

    static long gcd(int big, int small, long total){
        if(small == 0){
            total += big;
            return total;
        }
        return gcd(small, big%small, total);
    }

    static long sort(int[] i_list, long total){
        Arrays.sort(i_list);
        for (int i = 0; i < i_list.length; i++) {
            for (int j = i+1; j < i_list.length; j++) {
                total = gcd(i_list[j], i_list[i], total);
            }
        }
        return total;
    }
}