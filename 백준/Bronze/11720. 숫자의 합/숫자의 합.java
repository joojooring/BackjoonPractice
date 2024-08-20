import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int a = sc.next(); // 둘째 줄에 숫자 N개가 공백없이 주어지고 각각을 숫자로 인식해야되기 때문에 int로 하지 않고 String으로 한 후 (int)로 변환필요
        String result = sc.next();
        int sum = 0;
        for(int i=0; i<num;i++){
            sum += (int) result.charAt(i) -'0'; //문자를 아스키코드 숫자로 변환하려면 '0'을 빼야됨
        }
        System.out.println(sum);

    }
}