import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(arr[ch - 'a'] == -1 ){ // 초기상태에 -1로 세팅했기 때문에 예를 들어 문자열 "hello" 일 때 'h'에서 arr[7] = -1  true가 되어 arr[7] = 0으로 설정됨
                arr[ch - 'a'] = i;
            }
        }
        
        for(int result : arr){
            System.out.print(result + " ");
        }
        
    }
}