import java.util.PriorityQueue;

public class PriorityQueueStringLengthComparator {
    ///// przyklad - sortowanie automatyczne ze wgledu na długość znaków w stringu
    public static void main(String[] args) {
        PriorityQueue<String> test = new PriorityQueue<>(new PriorityStringLenghtComparator());
        test.add("Daniel");
        test.add("Ola");
        test.add("Adam");
        test.add("Adam");
        test.add("Katarzyna");
        test.add("Piotr");
        while(!test.isEmpty()){
            System.out.println(test.poll());
        }
    }
}
