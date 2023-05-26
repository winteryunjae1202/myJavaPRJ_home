import java.util.Scanner;

public class A0526 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.print("거스름돈의 액수는 얼마인가요? : ");
        int num = s.nextInt();
        int num1 = num;
        while(num1 >= 10000){
            num1 = num1 - 10000;
            a = a + 1;
        }
        while(num1 >= 1000){
            num1 = num1 - 1000;
            b = b + 1;
        }
        while(num1 >= 100){
            num1 = num1 - 100;
            c = c + 1;
        }
        System.out.printf("거스름돈 %d원은 10000원짜리 %d장, 1000원짜리 %d장, 100원짜리 %d개 입니다.", num, a, b, c);
    }
}
