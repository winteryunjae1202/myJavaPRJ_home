import java.util.Scanner;

public class A0529 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        int hap = 0;
        for(int i = a; i <= b; i++){
            int p = i;
            while(p != 0){
                if(p%10 == k){
                    hap = hap+1;
                }
                p = p/10;
            }
        }
        System.out.print(a + "부터 " + b + "까지 " + k + "의 개수는 " + hap + "개 입니다.");
    }
}
