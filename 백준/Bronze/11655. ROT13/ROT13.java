import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] new_str = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int asc = (int)str.charAt(i);

            if(asc>=97 && asc<=122){
                asc += 13;
                if(asc > 122){
                    asc -= 26;
                }
                new_str[i] = (char)asc;
            }else if(asc>=65 && asc<=90){
                asc += 13;
                if(asc > 90){
                    asc -= 26;
                }
                new_str[i] = (char)asc;
            }else{
                new_str[i] = (char)asc;
            }
        }
        
        for (char c : new_str) {
            bw.write(c);
        }

        bw.flush();
        bw.close();
    }
}