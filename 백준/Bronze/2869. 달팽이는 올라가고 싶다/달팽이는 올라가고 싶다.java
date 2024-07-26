import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V-B) / (A-B);
        if((V-B) % (A-B) != 0){
            day++;
        }

        bw.write(day + "\n");

        bw.flush();
        bw.close();
    }
}