import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++){
            String words = sc.nextLine();
            System.out.println(words.charAt(0) + "" + words.charAt(words.length() - 1));
        }
    }
}
