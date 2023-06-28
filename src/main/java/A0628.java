import java.util.Scanner;

public class A0628 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("비교할 문자열을 입력하세요 : ");
        String a = s.nextLine();
        System.out.print("비교할 두번째 문자열을 입력하세요 : ");
        String b = s.nextLine();

        if(a.compareTo(b) == 0){
            System.out.println("두 문자열은 일치합니다.");
        } else if(a.compareTo(b) != 0) {
            System.out.println("두 문자열은 불일치합니다.");
        }
    }
}
