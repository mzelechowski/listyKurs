import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetChallenge {
    public static void main(String[] args) throws InterruptedException {
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            list.add((int) Math.round(Math.random()*100));
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
