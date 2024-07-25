import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();
        int length = N.length() - 1;
        int ten = 0;

        for (int i = 0; i < N.length(); i++) {
            int asc = N.charAt(i);
            if(asc >= 65 && asc <= 90){
                asc -= 55;
            }else{
                asc -= 48;
            }

            ten += asc * Math.pow(B, length);
            length--;
        }

        System.out.println(ten);

        sc.close();
    }
}