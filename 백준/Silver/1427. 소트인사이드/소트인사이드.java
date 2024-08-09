import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int[] zza = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            zza[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        Arrays.sort(zza);

        for (int i = N.length()-1; i >= 0; i--) {
            System.out.print(zza[i]);
        }
        System.out.println();

        sc.close();
    }
}