package SDE_Sheet_Apna.Graph;

import java.util.ArrayList;
import java.util.*;

public class Count_No_of_Path_BW_2_Vertices
{
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
        Count_No_of_Path_BW_2_Vertices g=new Count_No_of_Path_BW_2_Vertices();
        System.out.println(g.countPaths(vertices,adj,0,4));
    }
    public int countPath(int v, ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        // Code here

        boolean vis[]=new boolean[v];
        int ct=dfs(v,adj,source,destination,vis);
        return ct;
    }
    public int dfs(int v, ArrayList<ArrayList<Integer>> adj, int src, int dest,boolean vis[]) {

        if(vis[src])
        {
            return 0;
        }
        if (src == dest) {
            return 1;
        }

        vis[src]=true;
        int ct=0;
        for (Integer neighbour: adj.get(src)) {
            ct+=dfs(v,adj,neighbour,dest,vis);
        }
        vis[src]=false;
        return ct;
    }
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                          int destination) {
        // Code here
        boolean[] visited = new boolean[V];
        return dfs(source, destination, adj, visited);
    }

    public int dfs(int source, int destination, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        //base case
        if(visited[source]) {
            return 0;
        }
        if(source == destination) {
            return 1;
        }

        //recursive case
        visited[source] = true;
        int count = 0;
        for(Integer nbr : adj.get(source)) {
            count += dfs(nbr, destination, adj, visited);
        }
        visited[source] = false;
        return count;
    }
}
