import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1="Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Bogdan");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.contains(p1));
        list.add("Daniel");
        list.add("Kuba");
        list.add(p1);
        list.add("Ania");
        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Ania");
        System.out.println(list);
        list.add(2, "Zenon");
        list.set(3, "Wojtek");
        System.out.println(list);
        ListIterator<String> interator1=list.listIterator();
        while(interator1.hasNext()){
            System.out.println(interator1.next());
        }
        ListIterator<String> interator2=list.listIterator(list.size());
        while (interator2.hasPrevious()){
            System.out.println(interator2.previous());
        }
    }
}

