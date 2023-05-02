import java.util.*;
public class A0502_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new LinkedList<>(); //정수 요소를 담을 list 생성
        System.out.print("입력 값 : ");
        for(int i = 0; i < 5; i++){  // 5개의 요소를 넣을것이므로 5번 반복
            int num = s.nextInt();   // 넣고싶은 값 입력
            list.add(num);           // 리스트에 값 추가
        }
        for(int i = 0; i < list.size(); i++){
            for(int k = i + 1; k < list.size(); k++){   // list 내의 두 요소를 비교
                if(list.get(i) == list.get(k)){         // 요소가 같으면
                    list.remove(k);                     // 뒷 요소를 제거하고
                    k--;                 // 요소 하나가 제거되었으므로 비교할 요소들을 하나씩 앞으로 가져옴
                }
            }
        }
        System.out.print("저장된 값은 ");
        for(int num: list) {            // list에 있는 정수 num을
            System.out.print(num + " ");        // 전부 출력함
        }
        System.out.print("입니다.");
    }
}
