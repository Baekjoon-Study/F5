import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
         int[] cheak = {1, 1, 2, 2, 2, 8};
         int[] onepiece = new int[6];

         for (int i = 0; i < onepiece.length; i++) {
            onepiece[i] = sc.nextInt();
         }

         for (int i = 0; i < onepiece.length; i++) {
            System.out.print(cheak[i] - onepiece[i] + " ");
         }

        sc.close();
    }
}