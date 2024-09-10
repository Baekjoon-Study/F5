import java.util.*;
 
 
public class Main {
    
    
    
    public static void main(String[] args) {
    
        
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        int countTry = Integer.valueOf(input);
        String disInput = "";
        int bSum=0;
        int count=1;
        String output="";
        int[][] arr = new int[15][15];
        
        for(int i=0; i<15 ; i++) {
            arr[0][i] = i+1;
            arr[i][0] = 1;
        }
        
        
        for(int k=0  ; k <countTry ; k++) {
            disInput = sc.nextLine().trim();
            int a = Integer.parseInt(disInput);
            disInput = sc.nextLine().trim();
            int b = Integer.parseInt(disInput);
            
            for(int i=1; i<=a ; i++) {
                
                for(int j=1; j<=b; j++) {
                    
                    arr[i][j]= arr[i][j-1] + arr[i-1][j]; 
                    
                }
                
            }
            
            System.out.println(arr[a][b-1]);
            
        }
        
    }
    
}