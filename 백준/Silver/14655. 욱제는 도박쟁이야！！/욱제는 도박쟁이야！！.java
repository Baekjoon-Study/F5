import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        new Main().solution();
    }

    private void solution() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] firstArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n; i++) {
            if (firstArray[i] < 0) {
                int count = 0;
                while (count < 3) {
                    if (i + count > n - 1)
                        break;
                    else {
                        firstArray[i + count] *= -1;
                        count++;
                    }
                }
            }
        }

        input = br.readLine().split(" ");
        int[] secondArray = new int[n];
        for (int i = 0; i < n; i++) {
            secondArray[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n; i++) {
            if (secondArray[i] > 0) {
                int count = 0;
                while (count < 3) {
                    if (i + count > n - 1)
                        break;
                    else {
                        secondArray[i + count] *= -1;
                        count++;
                    }
                }
            }
        }

        int number1 = Arrays.stream(firstArray).sum();
        int number2 = Arrays.stream(secondArray).sum() * -1;
        bw.write((number1 + number2) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}