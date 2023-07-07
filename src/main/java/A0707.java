import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A0707 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("몇개의 숫자를 입력하실 건가요? :");
        int cnt = s.nextInt();
        List<Integer> num = new ArrayList<>();
        int arr[] = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = s.nextInt();
            num.add(arr[i]);
        }
        Collections.sort(num);
        System.out.print("크기 순으로 몇번째 숫자까지 더할건가요? : ");
        int a = s.nextInt();
        for(int i = 0; i < a; i++){
            sum += arr[i];
        }

        System.out.println(a + "번째 숫자까지의 합은 " + sum + "입니다.");
    }
}
