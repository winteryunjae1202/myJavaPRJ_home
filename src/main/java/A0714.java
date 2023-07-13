import java.util.Scanner;

public class A0714 {
    public static void main(String[] args) {
        int a = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("A가 가지고 있는 카드의 개수는? : ");
        int cnt_a = s.nextInt();
        int aa[] = new int[cnt_a];
        System.out.print("A가 가지고 있는 카드는? : ");
        for(int i = 0; i < aa.length; i++){
            aa[i] = s.nextInt();
        }

        System.out.print("B가 가지고 있는 카드의 개수는? : ");
        int cnt_b = s.nextInt();
        int bb[] = new int[cnt_b];
        System.out.print("B가 가지고 있는 카드는? : ");
        for(int i = 0; i < bb.length; i++){
            bb[i] = s.nextInt();
        }

        for(int i = 0; i < bb.length; i++){
            for(int k = 0; k < aa.length; k++){
                if(bb[i] == aa[k]){
                    a = 1;
                    k = aa.length;
                } else if(bb[i] != aa[k]){
                    a = 0;
                }
            }
            System.out.print(a + " ");
        }
    }
}
