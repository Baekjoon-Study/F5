import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] ABC = new int[26];
        for (int i = 0; i < ABC.length; i++) {
            ABC[i] = -1;
        }
        

        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            int seki = word.charAt(i) - 97;
            if(ABC[seki] == -1){
                ABC[seki] = i;
            }
        }

        for (int i = 0; i < ABC.length; i++) {
            System.out.print(ABC[i] + " ");
        }

        System.out.println();
        
        sc.close();
    }
}
