import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        D = B + C;
        if(D>=60){
            A += D/60;
            D %= 60;
        }
        if(A>=24){A-=24;}
        System.out.print(A + " ");
        System.out.println(D);

        sc.close();
    }
}
