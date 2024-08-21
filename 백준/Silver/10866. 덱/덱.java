import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(dq.size()>0){
                        bw.write(dq.removeFirst() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case "pop_back":
                    if(dq.size()>0){
                        bw.write(dq.removeLast() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case"size":
                    bw.write(dq.size() + "\n");
                    break;
                case "empty":
                    if(dq.size()>0){
                        bw.write(0 + "\n");
                    }else{
                        bw.write(1 + "\n");
                    }
                    break;
                case "front":
                    if(dq.size()>0){
                        bw.write(dq.getFirst() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case "back":
                    if(dq.size()>0){
                        bw.write(dq.getLast() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
