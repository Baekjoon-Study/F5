import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = 30;
        int[] students = new int[N];
        int[] zoyo = new int[N-2];

        for (int i = 0; i < zoyo.length; i++) {
            zoyo[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            students[i] = i + 1;
        }

        for (int i = 0; i < zoyo.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if(zoyo[i] == students[j]){
                    students[j] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            if(students[i] != 0){
                System.out.println(students[i]);
            }
        }
        
        
        sc.close();

        
    }
}
