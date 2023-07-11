import java.util.Scanner;

public class A0711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("최소값과 최대값으로 잡을 두 수를 입력하세요 : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int hap = (b - a) + 1;

        for(int i = a; i <= b; i++){
            for(int k = 1; k < i; k++){
                if(k * k == i){
                    hap -= 1;
                }
            }
        }

        System.out.print(a + "와 " + b + " 사이의 제곱이 아닌 수의 개수는 " + hap + "개 입니다.");
    }
}
