import java.util.HashMap;
import java.util.Map;

public class HashMapChallenge {
    public static void main(String[] args) {
        HashMap<String, Animal> animals = new HashMap<>();
        String[] names = {"Kot", "Pies", "Koza" , "Puma"};
        for (String n:names) {
            animals.put(n, new Animal(n));
        }
        System.out.println(animals.get("Puma"));
        System.out.println("Wyświetlamy zwierzeta przy pomocy FOREACH");
        for (Map.Entry<String, Animal> a: animals.entrySet()) {
            String key = a.getKey();
            Animal animal = a.getValue();
            System.out.println("Key: "+key+ " - animal: "+ animal);
        }
    }
}
