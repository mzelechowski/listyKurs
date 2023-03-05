import java.util.HashSet;
import java.util.Iterator;

public class HashSetChallenge {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Dodge", 2000));
        cars.add(new Car("Citroen", 2001));
        cars.add(new Car("Opel", 2022));
        cars.add(new Car("Dodge", 2000));
        cars.add(new Car("Citroen", 2001));
        cars.add(new Car("Opel", 20225));
        Car car4 = new Car("hyundai", 1995);
        cars.add(car4);
        cars.add(car4);
        Iterator<Car> iterCar = cars.iterator();
        while(iterCar.hasNext()){
            System.out.println(iterCar.next());
        }
        System.out.println("Wypisanie przy pomocy foreach");
        for (Car c:cars
             ) {
            System.out.println(c);

        }
    }
}
