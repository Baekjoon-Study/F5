import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        N -= 4;
        if(N % 4 == 0){
            N /= 4;
        }else{
            N = N / 4 + 1;
        }
        for (int i = 0; i < N; i++) {
            System.out.print("long ");
        }
        System.out.println("long int");
        sc.close();
    }
}

