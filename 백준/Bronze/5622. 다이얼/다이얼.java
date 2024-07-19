import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String dial = sc.next();
        int[] time = new int[dial.length()];
        for (int i = 0; i < dial.length(); i++) {
            char ch = dial.charAt(i);

            switch (ch) {
                case 'A': case 'B': case 'C':
                time[i] = 3;
                break;
                
                case 'D': case 'E': case 'F':
                time[i] = 4;
                break;

                case 'G': case 'H': case 'I':
                time[i] = 5;
                break;

                case 'J': case 'K': case 'L':
                time[i] = 6;
                break;

                case 'M': case 'N': case 'O':
                time[i] = 7;
                break;

                case 'P': case 'Q': case 'R': case'S':
                time[i] = 8;
                break;

                case 'T': case 'U': case 'V':
                time[i] = 9;
                break;

                case 'W': case 'X': case 'Y': case 'Z':
                time[i] = 10;
                break;
            }
        }

        int total_time = 0;
        for (int i = 0; i < time.length; i++) {
            total_time += time[i];
        }

        System.out.println(total_time);

        sc.close();
    }
}