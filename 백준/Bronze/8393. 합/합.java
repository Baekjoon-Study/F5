import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);

        sc.close();
    }
}
