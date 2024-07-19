import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String A;
        while (sc.hasNextLine()) {
            A = sc.nextLine();
            System.out.println(A);
        }
        sc.close();
    }
}
