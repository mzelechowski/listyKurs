import java.util.Comparator;

public class ComparatorPriorityAscending implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) return 0;
        if (x > y)   //sortowanie rosnące
            return 1;
        else
            return -1;
    }
}
