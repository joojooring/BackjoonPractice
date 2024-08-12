import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for(int i=0; i<a; i++){
           numbers[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int count = 0;
      
        for(int i=0; i<a; i++){
            if(numbers[i]==v){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}