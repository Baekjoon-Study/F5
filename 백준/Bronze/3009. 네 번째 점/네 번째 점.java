import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < y.length; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        System.out.println(findOther(x) + " " + findOther(y));


        sc.close();
    }
    public static int findOther(int[] a){
        if(a[0] == a[1]){
            return a[2];
        }else if(a[0] == a[2]){
            return a[1];
        }else{
            return a[0];
        }
    }
}