import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.countTokens() > 0){
                String str = st.nextToken();
                
                for (int j = str.length()-1; j >= 0; j--) {
                    bw.write(str.charAt(j));
                }
                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
