import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();
        float[] grade = new float[N];

        float M = 0;
        for (int i = 0; i < N; i++) {
            grade[i] = sc.nextInt();
            if(M<grade[i]){
                M = grade[i];
            }
        }

        float average = 0;
        for (int i = 0; i < N; i++) {
            grade[i] = grade[i]/M*100;
            average += grade[i];
        }
        average /= N;
        System.out.println(average);

        sc.close();


    }
}
