import java.util.*;
public class A0502 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new LinkedList<>(); // 정수 list 생성
        System.out.print("입력 값: ");
        for(int i = 0; i < 5; i++){ // 입력값을 5번 받을것이므로 5번 반복
            int num = s.nextInt();  // 임의의 입력값을 스캐너로 받음
            list.add(num);          // 입력한 값을 list에 추가함
        }
        for(int i = 0; i < list.size(); i++){       // list에 있는 요소를
            for(int k = i+1; k < list.size(); k++){     // 서로 비교할것임
                if(list.get(i) < list.get(k)){      // 만약 앞쪽의 요소가 더 작을 경우
                    int temp = list.get(i);         // 임의의 변수 temp를 통해
                    list.set(i, list.get(k));       // set을 이용해 두 요소의 자리를 바꿈
                    list.set(k, temp);
                }
            }
        }
        System.out.print("출력 값: ");
        for (int num : list) {          //  정수 목록인 list를 출력함
            System.out.print(num + " ");
        }
    }
}
