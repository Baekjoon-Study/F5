import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            q.offer(i+1);
        }

        bw.write("<");
        while(q.size() > 1){
            for (int i = 1; i < K; i++) {
                q.offer(q.poll());   
            }
            bw.write(q.poll() + ", ");
        }
        bw.write(q.poll() + ">");

        bw.flush();
        bw.close();
    }
}
