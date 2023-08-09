import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A0809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇 명의 사람이 서있나요? : ");
        int cnt = s.nextInt();
        System.out.print("각 인원의 사용 시간을 입력해주세요. : ");
        int[]arr = new int[cnt];

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < cnt; i++){
            arr[i] = s.nextInt();
            list.add(arr[i]);
        }

        Collections.sort(list);

        int[]sum = new int[cnt];
        int hap = 0;
        for(int i = 0; i < cnt; i++){
            for(int k = 0; k <= i; k++){
                sum[i] += list.get(k);
            }
            hap = hap + sum[i];
        }
        System.out.print("총 사용시간의 합은 " + hap + "분 입니다.");
    }
}
