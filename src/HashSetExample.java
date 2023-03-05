import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<>();
        Animal a = new Animal("Tiger");
        animals.add(a);
        animals.add(a);
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Tiger"));

        Iterator<Animal> iterator = animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
