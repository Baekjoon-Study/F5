import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String constant_1, constant_2;
        int num_1 = 0, num_2 = 0;
        
        constant_1 = sc.next();
        for (int i = 0; i < 3; i++) {
            num_1 += Integer.parseInt(String.valueOf(constant_1.charAt(i))) * Math.pow(10, i);
        }
        constant_2 = sc.next();
        for (int i = 0; i < 3; i++) {
            num_2 += Integer.parseInt(String.valueOf(constant_2.charAt(i))) * Math.pow(10, i);
        }
        
        if(num_1 > num_2){
            System.out.println(num_1);
        }else{
            System.out.println(num_2);
        }
         
        
        sc.close();
    }
}
