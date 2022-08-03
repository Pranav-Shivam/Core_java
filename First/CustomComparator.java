package First;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        return 0;
    }

    @Override
    public Comparator<Integer> reversed() {
        return Comparator.super.reversed();
    }
}
