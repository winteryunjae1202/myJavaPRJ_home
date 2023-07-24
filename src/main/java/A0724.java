import java.util.Scanner;

public class A0724 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = s.next();

        System.out.print("비밀번호 확인을 위해 비밀번호를 재입력하세요 : ");
        String pw1 = s.next();

        if(pw.equals(pw1)) {
            System.out.println("비밀번호가 일치합니다.");
        } else {
            System.out.println("불일치합니다. 다시 입력해주세요.");
        }
    }
}
