import java.util.Scanner;

public class A0718 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("체스판은 M*N으로 이루어져 있나요? : ");
        int m = s.nextInt();
        int n = s.nextInt();
        char arr[][] = new char[m][n];

        for(int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                if ((i + k) % 2 == 0) {
                    arr[i][k] = 'W';
                } else if ((i + k) % 2 != 0){
                    arr[i][k] = 'B';
                }
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }
    }
}
