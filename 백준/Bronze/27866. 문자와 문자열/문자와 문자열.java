import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String S;
        S = sc.nextLine();

        int i;
        i = sc.nextInt();

        System.out.println(S.charAt(i-1));

        sc.close();


    }
}
