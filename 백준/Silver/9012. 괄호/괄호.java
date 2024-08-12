import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int top = 0;
            boolean tf = true;
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if((int)str.charAt(j) == 40){
                    top++;
                }else{
                    top--;
                }

                if(top < 0){
                    tf = false;
                }
            }

            if(tf == true && top == 0){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
