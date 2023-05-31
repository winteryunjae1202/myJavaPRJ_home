import java.util.Scanner;

public class A0531 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("부를 숫자의 개수를 입력하세요 : ");
        int num = s.nextInt();
        int a, b;
        int arr[] = new int[num];
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        a = s.nextInt();
        b = s.nextInt();
        for(int i = a; i <= b; i++){
            max = arr[a];
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(a + "번째 수 부터 " + b + "번째 수까지의 최댓값은 " + max + "입니다.");
    }
}
