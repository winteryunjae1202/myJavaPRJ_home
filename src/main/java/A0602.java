import java.util.Scanner;

public class A0602 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = s.nextLine();
        String str1, str2, str3[];

        str1 = str.replace(" ", "$");
        str2 = str.substring(3,8);
        str3 = str.split(" ");

        System.out.println("replace사용 => " + str1);
        System.out.println("substring 사용 => " + str2);
        for(int i = 0; i < str3.length; i++)
            System.out.print(str3[i] + " ");
    }
}
