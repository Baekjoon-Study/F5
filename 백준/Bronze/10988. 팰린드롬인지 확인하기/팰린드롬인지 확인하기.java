import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        char[] word = new char[st.length()];
        char[] check = new char[st.length()];

        for (int i = 0; i < st.length(); i++) {
            int j = st.length()-(i+1);
            word[i] = st.charAt(i);
            check[i] = st.charAt(j);
        }
        for (int i = 0; i < st.length(); i++) {
            if(word[i] != check[i]){
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);

        sc.close();
    }
}