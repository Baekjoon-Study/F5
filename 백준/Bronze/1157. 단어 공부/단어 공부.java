import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] asc = new int[26];
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i);
            if(num> 64 && num <91){
                num -= 65;
            }else if(num> 96 && num < 123){
                num -= 97;
            }
            asc[num] += 1;
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i < asc.length; i++) {
            if(asc[i] == 0){
                continue;
            }else if(asc[i] > max){
                max = asc[i];
                result = (char)(i + 65);
            }else if(asc[i] == max){
                result = '?';
            }
        }
        System.out.println(result);

        sc.close();
    }
}