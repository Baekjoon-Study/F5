import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        if(s.length() % 3 == 2){
            s = "0" + s;
        }else if(s.length()%3 == 1){
            s = "00" + s;
        }
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i+=3) {
            int result = (s.charAt(i) - '0') * 4 
            + (s.charAt(i+1) - '0') * 2
            + (s.charAt(i+2) - '0') * 1;
            str.append(result);
        }
        System.out.println(str);


        bw.flush();
        bw.close();
    }
}