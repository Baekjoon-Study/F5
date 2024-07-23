import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

            float total_grade = 0;;
            float total_num = 0;

        for (int i = 0; i < 20; i++) {
            float flt = 0;
            String str = sc.next();
            float grade = sc.nextFloat();
            String S = sc.next();

            switch(S){
                case "P":
                continue;

                case "A+":
                flt = 4.5f;
                break;

                case "A0":
                flt = 4.0f;
                break;

                case "B+":
                flt = 3.5f;
                break;

                case "B0":
                flt = 3.0f;
                break;

                case "C+":
                flt = 2.5f;
                break;

                case "C0":
                flt = 2.0f;
                break;

                case "D+":
                flt = 1.5f;
                break;

                case "D0":
                flt = 1.0f;
                break;
                
                case "F":
                flt = 0;
                break;
            }
            total_grade += grade * flt;
            total_num += grade;
        }
        System.out.println(total_grade / total_num);

        sc.close();
    }
}