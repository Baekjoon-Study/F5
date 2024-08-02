import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int num = 665;

        while(count != N){
            num++;
            String ns = String.valueOf(num);
            if(ns.contains("666")){
                count++;
            }
        }

        System.out.println(num);

        sc.close();
    }
}