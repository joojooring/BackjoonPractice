import java.util.*;
public class Main{
    public static void main(String[] args){
        //문자열 -> 아스키로 출력 : str -> (int) str.charAt(0)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int askii = (int) str.charAt(0);
        
        System.out.println(askii);

    }
}