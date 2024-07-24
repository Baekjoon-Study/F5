import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
        char[][] ch = new char[5][15];
        String S;

        for (int i = 0; i < 5; i++) {
            S = sc.nextLine();
            for (int j = 0; j < S.length(); j++) {
                ch[i][j] = S.charAt(j);
            }
        }
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] != '\u0000'){
                    System.out.print(ch[j][i]);
                }
            }
        }

        sc.close();
    }
}