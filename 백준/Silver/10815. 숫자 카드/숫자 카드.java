import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] n_array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            n_array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n_array);

        int M = Integer.parseInt(br.readLine());
        int[] M_array = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            M_array[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < M; i++) {
            bw.write(scanner(M_array[i], n_array) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
    public static int scanner(int m, int[] n_ary){
        int left = 0;
        int right = n_ary.length - 1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(n_ary[mid] == m){
                return 1;
            }else if(n_ary[mid] < m){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return 0;
    }
}