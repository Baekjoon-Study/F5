import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        Stack<Character> st = new Stack<>();
        boolean in_tag = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '<'){
                in_tag = true;
                while (!st.isEmpty()) {
                    bw.write(st.pop());
                }
                bw.write(ch);
            }else if(ch == '>'){
                bw.write(ch);
                in_tag = false;
            }else if(ch == ' '){
                while (!st.isEmpty()) {
                    bw.write(st.pop());
                }
                bw.write(ch);
            }else if(in_tag == true){
                bw.write(ch);
            }else{
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            bw.write(st.pop());
        }

        bw.flush();
        bw.close();
    }
}
