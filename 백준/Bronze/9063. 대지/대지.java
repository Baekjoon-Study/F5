import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int maxx = -10000, maxy = -10000, minx = 10000, miny = 10000;

        for (int i = 0; i < N; i++) {
            if(x[i] > maxx){
                maxx = x[i];
            }
            if(x[i] < minx){
                minx = x[i];
            }

            if(y[i] > maxy){
                maxy = y[i];
            }
            if(y[i] < miny){
                miny = y[i];
            }
        }

        System.out.println((maxx - minx) * (maxy - miny));
     
        sc.close();
    }
}