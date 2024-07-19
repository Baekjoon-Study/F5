import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] word;

        String str = sc.nextLine().trim();
        word = str.split(" ");

        if(str.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(word.length);
        }
        
        sc.close();
    }
}