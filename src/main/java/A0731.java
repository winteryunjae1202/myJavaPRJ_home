import java.time.LocalDate;
import java.util.Scanner;

public class A0731 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("오늘 날짜를 YYYY-MM-DD 형식으로 입력하세요 : ");
        String date = s.nextLine();

        LocalDate todaydate = LocalDate.parse(date);

        if(todaydate.getDayOfMonth() == 31) {
            System.out.println("하프갤런을 할인받으실 수 있습니다.");
        } else {
            System.out.println("오늘은 할인날이 아닙니다. 31일에 방문해주세요.");
        }

    }
}
