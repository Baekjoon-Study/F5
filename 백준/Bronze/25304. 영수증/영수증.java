import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_cost, total_count;
        total_cost = sc.nextInt();
        total_count = sc.nextInt();
        
        int[] cost = new int[total_count];
        int[] count = new int[total_count];
        
        for (int i = 0; i < total_count; i++) {
            cost[i] = sc.nextInt();
            count[i] = sc.nextInt();
        }

        int check = 0;
        for (int i = 0; i < total_count; i++) {
            check += cost[i] * count[i];    
        }

        if(total_cost == check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}
