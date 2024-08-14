import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[31]; // 총 학생 수 30명이지만 1부터 반복문 돌릴거라 +1
        int A;
        
        //출석체크 한 사람 
        for(int i=1; i<29; i++){
            A = sc.nextInt(); //매 반복마다 정수 A를 입력받음
            numbers[A] = 1; // 출석한 사람은 1로 설정
        }
        
        //출석체크 안한 사람
        for(int i=1; i<numbers.length;i++){
            if(numbers[i] !=1){ // 배열의 값이 1이 아니면 출석 안한거임
            System.out.println(i);
            }
        }
    }
}