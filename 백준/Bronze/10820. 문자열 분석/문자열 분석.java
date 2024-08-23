import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null) {
            int[] count = new int[4];
            for (int i = 0; i < str.length(); i++) {
                int asc = str.charAt(i);
                if(asc>=97 && asc<=122){
                    count[0]++;
                }else if(asc>=65 && asc<=90){
                    count[1]++;
                }else if(asc>=48 && asc<=57){
                    count[2]++;
                }else{
                    count[3]++;
                }
            }

            for (int i : count) {
                bw.write(i + " ");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
    }
}