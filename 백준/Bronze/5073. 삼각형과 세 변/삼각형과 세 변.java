import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true){
            int[] b = new int[3];
            for (int i = 0; i < 3; i++) {
                b[i] = sc.nextInt(); 
            }
            if(b[0] == 0 && b[1] == 0 && b[2] == 0){
                break;
            }
            
            if(isNot(b)){
                System.out.println("Invalid");
            }else if(b[0] == b[1] && b[1] == b[2]){
                System.out.println("Equilateral");
            }else if(b[0] == b[1] || b[1] == b[2] || b[0] == b[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
     
        sc.close();
    }

    public static boolean isNot(int[] b){
        Arrays.sort(b);
        return b[0] + b[1] <= b[2];
    }
}