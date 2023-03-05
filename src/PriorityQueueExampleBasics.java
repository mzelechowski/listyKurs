import java.util.PriorityQueue;

public class PriorityQueueExampleBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> test = new PriorityQueue<>();
        test.add(99);
        test.add(56);
        test.add(88);
        test.add(14);
        for (Integer t:test
             ) {
            System.out.println("Elementy kolejki test: "+t);
        }
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }
       if (test.isEmpty()){
           System.out.println("Kolejka test jest pusta");
        } else {
           System.out.println("Kolejka test nie jest pusta");
       }

        test.add(91);
        test.add(36);
        test.add(88);
        System.out.println(test.peek()); //36
        System.out.println(test.peek()); //36
    }
}
