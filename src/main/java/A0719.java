import java.util.Scanner;

public class A0719 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = s.nextLine();              // s.next()는 공백기준으로 첫 단어만 읽어오지만 s.nextLine()은 줄 전체를 읽어옴

        String[]words = str.split(" ");

        for(String word : words) {
            System.out.println(word);
        }
    }
}
