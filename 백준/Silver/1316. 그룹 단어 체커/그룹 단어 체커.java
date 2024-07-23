import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int total_group_word = 0;

        for (int i = 0; i < time; i++) {
            String word = sc.next();
            if(isGroupWord(word)){
                total_group_word++;
            }
        }

        System.out.println(total_group_word);

        sc.close();
    }
    public static boolean isGroupWord(String word){
        int[] asc = new int[26];
        char temp = word.charAt(0);
        asc[temp - 'a'] = 1;

        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(temp == ch){
                continue;
            }else{
                if(asc[ch - 'a'] != 0){
                    return false;
                }else{
                    asc[ch - 'a'] = 1;
                    temp = ch;
                }
            }
        }

        return true;
    }
}