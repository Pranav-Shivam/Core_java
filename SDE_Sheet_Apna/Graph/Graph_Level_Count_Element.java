package SDE_Sheet_Apna.Graph;

import java.util.*;

public class Graph_Level_Count_Element {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int vertices= sc.nextInt();
        int edge=sc.nextInt();
        for (int i = 0; i < vertices; i++) {
            adj.add(i,new ArrayList<>());
        }
        for (int i = 0; i <edge ; i++) {
            int srcVertex=sc.nextInt();
            int edgeValue=sc.nextInt();
            adj.get(srcVertex).add(edgeValue);
            adj.get(edgeValue).add(srcVertex);
        }
        Graph_Level_Count_Element graph=new Graph_Level_Count_Element();
        graph.countLevel(vertices,adj,3);
    }
    public int countLevel(int v,ArrayList<ArrayList<Integer>> adj,int l)
    {
        int ct=0;
        boolean vis[]=new boolean[v];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        ArrayList<Integer> arr=new ArrayList<>();
        while (!queue.isEmpty())
        {
            int cur=queue.poll();
            if (vis[cur] == true) {
                continue;
            }
            vis[cur]=true;
            arr.add(cur);
            for (Integer neighbour: adj.get(cur)) {
                if(vis[cur]==false)
                {
                    queue.add(neighbour);
                }
            }
        }
        for (int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==l)
            {
                ct++;
            }
        }
        return ct;
    }
}
