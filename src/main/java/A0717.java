import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A0717 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("직사각형의 오른쪽 위 꼭짓점의 좌표를 입력하세요 : ");
        int w = s.nextInt();
        int h = s.nextInt();
        System.out.print("사각형 내의 현재 위치의 x,y 좌표를 입력하세요 : ");
        int x = s.nextInt();
        int y = s.nextInt();

        int a = w-x;
        int b = h-y;

        List<Integer> num = new ArrayList<>();
        num.add(x);
        num.add(y);
        num.add(a);
        num.add(b);

        Collections.sort(num);

        int min = num.get(0);
        System.out.print(x + ", " + y + "에서 경계선까지의 거리는 " + min + "입니다.");
    }
}
