package SDE_Sheet_Apna.Graph;

import java.util.*;
public class PrintAdjacenyList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices ");
        int vertices=sc.nextInt();
        System.out.println("Enter no of edges");
        int edge=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        System.out.println("Enter no "+ edge+" edges");
        for (int i=0;i<vertices;i++) {
            adj.add(i, new ArrayList<>());
        }
        for (int j = 0; j < edge; j++) {
            int source=sc.nextInt();
            int value=sc.nextInt();
            adj.get(source).add(value);
            adj.get(value).add(source);
        }

        System.out.println(new PrintAdjacenyList().printGraphs(vertices,adj));
    }
    public ArrayList<ArrayList<Integer>> printGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for (int i = 0; i < v; i++) {
            ArrayList<Integer> edge=new ArrayList<>();
            edge.add(i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                edge.add(adj.get(i).get(j));
            }
            arr.add(edge);
        }
        return arr;
    }
    public ArrayList<ArrayList<Integer>> printGraphs(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        for(int i=0;i<v;i++){
            adj.get(i).add(0,i);
        }
        return adj;
    }
}
