import java.util.Scanner;

public class A0801 {
    public static int comparison(int a, int b) {
        return a > b ? (a + b) : (a * b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("비교할 두 수를 입력하세요.");
        int a = s.nextInt();
        int b = s.nextInt();

        if(a > b) {
            System.out.print("두 수를 비교했을 때 a가 b보다 큽니다. 따라서 " + comparison(a, b) + "를 출력합니다.");
        } else {
            System.out.print("두 수를 비교했을 때 a가 b보다 크지 않습니다. 따라서 " + comparison(a, b) + "를 출력합니다.");
        }
    }
}
