import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        
        int max = 0;
        for (int i = 0; i < b.length; i++) {
            if(max<b[i]){
                max = b[i];
            }
        }

        if(max < b[0] + b[1] + b[2] - max){
            System.out.println(b[0] + b[1] + b[2]);
        }else{
            System.out.println((b[0] + b[1] + b[2] - max) * 2 - 1);
        }
        
        sc.close();
    }
}