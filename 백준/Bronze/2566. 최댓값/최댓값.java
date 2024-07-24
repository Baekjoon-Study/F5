import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int C = 1, L = 1;
        int[][] baduk = new int[9][9];

        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                if(max < baduk[i][j]){
                    max = baduk[i][j];
                    C = i + 1;
                    L = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(C + " " + L);

        sc.close();
    }
}