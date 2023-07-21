import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A0721 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("5개의 숫자를 입력하세요 : ");
        for(int i = 0; i < 5; i++){
            int a = s.nextInt();
            list.add(a);
            sum = sum + a;
        }
        Collections.sort(list);

        System.out.println("평균값 : " + sum/5);

        System.out.println("중간값 : " + list.get(2));
    }
}
