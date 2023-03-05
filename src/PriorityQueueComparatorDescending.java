import java.util.PriorityQueue;

public class PriorityQueueComparatorDescending {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>(new ComparatorPriorityDescending());
        test.add(99);
        test.add(56);
        test.add(88);
        test.add(14);
        for (Integer t : test
        ) {
            System.out.println("Elementy kolejki test: " + t);
        }
        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }

}
