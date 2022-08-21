package SDE_Sheet_Apna.Graph;

import java.util.*;
public class GFG_BFS {
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
            }

        ArrayList<Integer> arr=new GFG_BFS().bfsOfGraph(vertices,adj);
        System.out.println(arr);
    }
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> queue=new LinkedList<>();
        boolean vis[]=new boolean[v];
        ArrayList<Integer> arr=new ArrayList<>();
        queue.add(0);
        while(!queue.isEmpty())
        {
            int cur=queue.poll();
            if(vis[cur]==true)
            {
                continue;
            }
            arr.add(cur);
            vis[cur]=true;
            for (Integer neighbour:adj.get(cur)) {
                if (vis[neighbour] == false) {
                    queue.add(neighbour);
                }
            }
        }
        return arr;
    }
}
