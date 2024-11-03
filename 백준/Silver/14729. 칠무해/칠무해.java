import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] answer = new int[100001];
        for (int i = 0; i < n; i++) {
            int input = (int) (Double.parseDouble(br.readLine()) * 1000);
            answer[input]++;
        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length && cnt < 7; i++) {
            while (answer[i] > 0 && cnt < 7) {
                sb.append(String.format("%.3f\n", i / 1000.0));
                answer[i]--;
                cnt++;
            }
        }
        System.out.print(sb);
    }
}
