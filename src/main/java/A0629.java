import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A0629 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇개의 숫자를 입력하실건가요? ");
        int cnt = s.nextInt();
        int arr[] = new int[cnt];
        List <Integer> num = new ArrayList<>();
        for(int i = 0; i < cnt; i++){
            arr[i] = s.nextInt();
            num.add(arr[i]);
        }
        Collections.sort(num);
        System.out.println("배열의 중간 숫자는 " + arr[cnt/2 - 1] + "입니다.");
    }
}
