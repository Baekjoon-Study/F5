import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String S;
        String P = "";
        int T, R;

        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            R = sc.nextInt();
            S = sc.next();
            for (int j = 0; j < S.length(); j++) {
                for (int j2 = 0; j2 < R; j2++) {
                    
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
