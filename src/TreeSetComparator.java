import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        TreeSet<Animal> animals = new TreeSet<>(new AnimalComparator());
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Cat"));
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Lion"));

        /// Wyswietli posortowane elementy wg klasy Comparator oraz usuwa takie same elementy dzieki equals oraz hashcode
        for (Animal a:animals
             ) {
            System.out.println(a);
        }
    }
}

