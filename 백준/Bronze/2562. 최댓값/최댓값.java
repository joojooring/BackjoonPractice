import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        int maxNum = numbers[0];
        int index = 0;
        
        for(int i=0; i<numbers.length; i++){
            numbers[i]=sc.nextInt();
            if(numbers[i]>maxNum){
                maxNum = numbers[i];
                index = i+1;
            }
        }
        System.out.println(maxNum);
        System.out.println(index);
    }
}