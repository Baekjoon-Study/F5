import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        ArrayList<Character> list = new ArrayList<>();

        while(0 < N){
            int base = N % B;
            if(base < B && base > 9){
                base += 55;
            }else{
                base += 48;
            }
            
            list.add(0, (char)base);
            N /= B;
        }

        for (Character character : list) {
            System.out.print(character);
        }
        sc.close();
    }
}