import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] xy = new int[4];
        xy[0] = w - x;
        xy[1] = h - y;
        xy[2] = x;
        xy[3] = y;

        int min = 10000;
        for (int i = 0; i < 4; i++) {
            if(xy[i] < min){
                min = xy[i];
            }
        }
        System.out.println(min);

        sc.close();
    }
}