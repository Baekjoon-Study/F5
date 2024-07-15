import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int number, space;
        number = sc.nextInt();
        
        for (int i = 1; i <= number; i++) {
            space = number - i;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - space; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
