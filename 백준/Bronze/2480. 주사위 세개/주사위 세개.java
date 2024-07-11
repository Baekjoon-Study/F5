import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if(A==B && B == C){
            D = 10000 + A*1000;
        }else if(A==B || B==C ){
            D = 1000 + B*100;
        }else if(A == C){
            D = 1000 + 100*A;
        }else{
            D = 100*Math.max(A, Math.max(B, C));
        }
        System.out.println(D);

        sc.close();
    }
}
