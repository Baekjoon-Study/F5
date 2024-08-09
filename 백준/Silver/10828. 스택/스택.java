import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int top = -1;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    stack[++top] = value;
                    break;
                case "pop":
                    if (top == -1) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack[top--] + "\n");
                    }
                    break;
                case "size":
                    bw.write((top + 1) + "\n");
                    break;
                case "empty":
                    bw.write((top == -1 ? "1" : "0") + "\n");
                    break;
                case "top":
                    bw.write((top == -1 ? "-1" : stack[top]) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
