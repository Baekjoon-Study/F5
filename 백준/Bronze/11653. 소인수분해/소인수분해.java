import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int y = 2;

        while(N != 1){
            if(N % y == 0){
                N /= y;
                System.out.println(y);
            }else{
                y++;
            }
        }

        sc.close();
    }
}