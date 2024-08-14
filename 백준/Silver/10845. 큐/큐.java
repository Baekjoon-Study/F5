import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] N_list = new int[N];
        int top = -1;
        int bottom = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    N_list[++top] = Integer.parseInt(st.nextToken());
                    break;
                case "pop":
                    bw.write((bottom > top ? -1 : N_list[bottom++]) + "\n");
                    break;
                case "size":
                    bw.write((bottom > top ? 0 : top - bottom + 1) + "\n");
                    break;
                case "empty":
                    bw.write((bottom > top ? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write((bottom > top ? -1 : N_list[bottom]) + "\n");
                    break;
                case "back":
                    bw.write((bottom > top ? -1 : N_list[top]) + "\n");
                    break;
                default:
                    break;
            }
        }

        

        bw.flush();
        bw.close();
    }
}
