package First;

import java.util.HashMap;
import java.util.Iterator;

public class Exp_4
{
    public static void main(String[] args)
    {
        //Creating a hash-map
        HashMap<Character,Integer> map1=new HashMap<>();
        //to associate the specified value with the specified key in a HashMap
        map1.put('A',1);
        map1.put('E',5);
        map1.put('I',9);
        map1.put('O',15);
        map1.put('U',21);
        System.out.println("Map1");
        System.out.println(map1);
        System.out.println();
        //to count the number of key-value (size) mappings in a map
        int map1Size= map1.size();
        System.out.println("The size of map1 is : "+map1Size);
        //to copy all of the mappings from the specified map to another map
        HashMap<Character,Integer> map2=new HashMap<>();
        map2.put('B',2);
        map2.put('F',6);
        map2.put('J',10);
        map2.put('P',16);
        map2.put('V',22);
        map2.putAll(map1);
        System.out.println("Map2");
        System.out.println(map2);
        // to test if a map contains a mapping for the specified value
        System.out.println();
        if (map2.containsValue(26))
        {
            System.out.println("yes 26 is available");
        }
        else
        {
            System.out.println("no 26 is not available");
        }

    }
}
