import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N == 1) {
            System.out.println(1);
            sc.close();
            return;
        }

        int total = 1;
        int count = 1;

        while (total < N) {
            total += 6 * count;
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}
