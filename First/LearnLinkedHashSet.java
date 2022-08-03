package First;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class LearnLinkedHashSet {
    public static void main(String args[])
    {
        Set<Integer> set=new LinkedHashSet<>();
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
