package SDE_Sheet_Apna._2DArray;

import java.util.*;
public class Pascal_Triangle {
    public static void main(String[] args) {
        System.out.println(new Pascal_Triangle().pascalTri(8));
    }
    public List<List<Integer>> pascalTri(int r)
    {
        List<List<Integer>> pascal=new LinkedList<List<Integer>>();
        for (int i = 0; i < r; i++) {
            List<Integer> adder=new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if (j == i ||j==0) {
                    adder.add(1);
                }
                else {
                    List<Integer> prev=pascal.get(i-1);
                    adder.add(prev.get(j-1)+prev.get(j));
                }
            }
            pascal.add(adder);
        }
        return pascal;
    }
}
