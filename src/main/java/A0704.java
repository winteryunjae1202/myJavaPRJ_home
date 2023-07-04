import java.util.Scanner;

public class A0704 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 선의 양 끝점을 입력하세요 : ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("두번째 선의 양 끝점을 입력하세요 : ");
        int c = s.nextInt();
        int d = s.nextInt();

        if(c < d){
            if(a < b){
                if(a < c && c < b){
                    System.out.print("CROSS");
                } else {
                    System.out.print("NOT CROSS");
                }
            } else if(a > b){
                if(b < c && c < a){
                    System.out.print("CROSS");
                } else {
                    System.out.print("NOT CROSS");
                }
            }
        } else if(c > d){
            if(a < b){
                if(a < d && d < b){
                    System.out.print("CROSS");
                } else {
                    System.out.print("NOT CROSS");
                }
            } else if(a > b){
                if(b < d && d < a){
                    System.out.print("CROSS");
                } else {
                    System.out.print("NOT CROSS");
                }
            }
        }
    }
}
