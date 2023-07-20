import java.util.*;

public class A0720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇장의 카드를 다룰건가요? : ");
        int cnt = s.nextInt();
        Queue<Integer> cards = new LinkedList<>();
        for (int i = 1; i <= cnt; i++) {
            cards.add(i);
        }

        List<Integer> list = new ArrayList<>();
        while (cards.size() > 1) {
            int card = cards.poll();
            list.add(card);

            int movedCard = cards.poll();
            cards.add(movedCard);
        }

        for (int card : list) {
            System.out.print(card + " ");
        }

        System.out.println(cards.peek());
    }
}

