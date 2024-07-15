import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int a, b;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        int i = 0;
        
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();

            if(a != 0 && b != 0){    
                A.add(a);
                B.add(b);
            }else{
                break;
            }
        }
        for (int j = 0; j < A.size(); j++) {
            System.out.println(A.get(j)+B.get(j));
        }
        sc.close();

        
    }
}

