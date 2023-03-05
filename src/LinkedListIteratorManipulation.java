import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorManipulation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1="Ola";
        list.add(p1);
        list.addFirst("Rafał");
        list.addLast("Bogdan");
        System.out.println(list);
        ListIterator<String> iterator= list.listIterator();


        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            if (str.equalsIgnoreCase("Ola")){
                iterator.set("Super Ola");
            }
            if(str.equalsIgnoreCase("Adam")){
                iterator.add("Karol");
            }
            if(str.equalsIgnoreCase("Rafał")){
                iterator.remove();
            }
       }
        System.out.println("Wszystkie elementy tablicy po zmodyfikowaniu");
        iterator= list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
