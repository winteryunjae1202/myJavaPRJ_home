import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class A0627 {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        Scanner s = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int cnt = s.nextInt();
        int arr[] = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = s.nextInt();
            num.add(arr[i]);
        }
        ArrayList<Integer> num1 = new ArrayList<>(num);
        Collections.sort(num1);

        num1.forEach(n -> System.out.print(n + " "));

    }
}
