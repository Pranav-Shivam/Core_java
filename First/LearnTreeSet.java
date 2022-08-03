package First;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String args[])
    {
        Set<Integer> set=new TreeSet<>();
        set.add(45);
        set.add(57);
        set.add(97);
        set.add(54);
        set.add(7);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(54);
        System.out.println(set);
        System.out.println(set.contains(57));
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
