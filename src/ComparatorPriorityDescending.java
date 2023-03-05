import java.util.Comparator;

public class ComparatorPriorityDescending implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y) return 0;
        if (x < y)  // malejąco
            return 1;
        else
            return -1;
    }
}
