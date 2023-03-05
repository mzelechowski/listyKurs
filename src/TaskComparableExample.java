import java.util.PriorityQueue;

public class TaskComparableExample {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task(7, "Zakupy"));
        tasks.add(new Task(1, "Praca"));
        tasks.add(new Task(10, "Film"));
        tasks.add(new Task(4, "Nauka"));
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
//////////// Kolejnosc malejaca ze wzgleu na definicyje w TaskClassComparator x < y
        System.out.println("Kolejnosc malejaca");
        PriorityQueue<Task> tasks1 = new PriorityQueue<>(new TaskClassComparator());
        tasks1.add(new Task(7, "Zakupy"));
        tasks1.add(new Task(1, "Praca"));
        tasks1.add(new Task(10, "Film"));
        tasks1.add(new Task(4, "Nauka"));
        while (!tasks1.isEmpty()) {
            System.out.println(tasks1.poll());
        }
    }
}
