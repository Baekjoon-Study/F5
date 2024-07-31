import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] B = new int[3];

        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        if(B[0] == 60 && B[1] == 60 && B[2] == 60){
            System.out.println("Equilateral");
        }else if(B[0] + B[1] + B[2] == 180 && (B[0] == B[1] || B[1] == B[2] || B[0] == B[2])){
            System.out.println("Isosceles");
        }else if(B[0] + B[1] + B[2] == 180){
            System.out.println("Scalene");
        }else{
            System.out.println("Error");
        }
     
        sc.close();
    }
}