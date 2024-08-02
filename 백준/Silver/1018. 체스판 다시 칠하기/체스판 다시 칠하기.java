import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[][] tf = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W'){
                    tf[i][j] = true;
                }else{
                    tf[i][j] = false;
                }
            }
        }

        int min = M*N;
        int total = 0;
        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
               total = min_finder(tf, i, j);
               if(total < min){
                min = total;
               }
            }
        }

        System.out.println(min);

        sc.close();
    }

    public static int min_finder(boolean[][] tf, int y, int x){
        int reselt_1 = 0;
        int reselt_2 = 0;
        int end_x = x + 8;
        int end_y = y + 8;
        boolean temp_w = true;
        boolean temp_b = false;

        for (int i = y; i < end_y; i++) {
            for (int j = x; j < end_x; j++) {
                if(tf[i][j] != temp_w){
                 reselt_1++;   
                }
                temp_w = !temp_w;
            }
            temp_w = !temp_w;
        }

        for (int i = y; i < end_y; i++) {
            for (int j = x; j < end_x; j++) {
                if(tf[i][j] != temp_b){
                 reselt_2++;   
                }
                temp_b = !temp_b;
            }
            temp_b = !temp_b;
        }

        int min = Math.min(reselt_1, reselt_2);

        return min;
    }
}