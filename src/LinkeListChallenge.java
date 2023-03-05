import java.util.Iterator;
import java.util.LinkedList;

public class LinkeListChallenge {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        String[] tab = {"Dog", "Cat", "Tiger", "Lion", "Panda"};
        String str;
        for (int i = 0; i < 10; i++) {
            str=tab[(int) Math.floor(Math.random()*tab.length)];
            animals.add(i, new Animal(str));
        }
        Iterator<Animal> iterator = animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        animals.removeFirst();
        animals.removeLast();
        animals.addFirst(new Animal("Tiger_FIRST"));
        animals.addLast(new Animal("LION_LAST"));
        iterator= animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
