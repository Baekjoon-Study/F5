import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int N = sc.nextInt();
        boolean[][] br = new boolean[101][101];
        for (int i = 0; i < N; i++) {
            int paper_x = sc.nextInt();
            int paper_y = sc.nextInt();

            for (int j = paper_x; j <= paper_x + 9; j++) {
                for (int k = paper_y; k <= paper_y + 9; k++) {
                    if(!br[j][k]){
                        br[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);

        sc.close();
    }
}
