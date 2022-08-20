package SDE_Sheet_Apna.Graph;

import java.util.*;
public class GFG_DFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        boolean vis[]=new boolean[v];
        st.add(0);
        while (!st.isEmpty())
        {
            int cur=st.pop();
            if(vis[cur]==true)
            {
                continue;
            }
            arr.add(cur);
            vis[cur]=true;
            for (Integer neighbour:adj.get(cur)) {
                if (vis[neighbour] == false) {
                    st.push(neighbour);
                }
            }
        }

        return arr;
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
