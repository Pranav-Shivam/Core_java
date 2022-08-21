package SDE_Sheet_Apna.Graph;

import java.util.*;
public class GFG_DFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices : ");
        int vertices=sc.nextInt();
        System.out.println("Enter the no of edges ");
        int edge=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(i, new ArrayList<>());
        }
            for (int j = 0; j < edge; j++) {
                int srcVertex=sc.nextInt();
                int edgeValue=sc.nextInt();
                adj.get(srcVertex).add(edgeValue);
            }

        ArrayList<Integer> dfs= new GFG_DFS().dfsOfGrap(vertices,adj);
        System.out.println(dfs);
    }

    public ArrayList<Integer> dfsOfGrap(int V, ArrayList<ArrayList<Integer>> adj) {
        return findT(0,adj,new boolean[V],new ArrayList<Integer>());
    }

    public ArrayList<Integer> findT(int V, ArrayList<ArrayList<Integer>> adj, boolean[] ver, ArrayList<Integer> ans){
        if(ver[V] == true) return ans;

        ver[V] = true;
        ans.add(V);

        for(int i : adj.get(V)){
            if(ver[i] == false){
                ans = findT(i,adj,ver,ans);
            }
        }

        return ans;
    }
}
