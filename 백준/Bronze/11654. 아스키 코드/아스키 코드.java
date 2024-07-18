import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        char asc = sc.next().charAt(0);

        int asc_code = asc;
        System.out.println(asc_code);
        
        sc.close();
    }
}
