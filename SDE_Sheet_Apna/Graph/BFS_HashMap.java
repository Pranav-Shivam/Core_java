package SDE_Sheet_Apna.Graph;


import java.util.*;

public class BFS_HashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertices= sc.nextInt();
        int edges=sc.nextInt();
        LinkedHashMap<Integer, ArrayList<Integer>> adj=new LinkedHashMap<>();
        for (int i = 0; i < vertices; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {

            int edgeVal = sc.nextInt();
            int srcVertex = sc.nextInt();
            //int srcVertex=(int)src.getValue();
            adj.get(srcVertex).add(edgeVal);
        }

        ArrayList<Integer> bfs=new BFS_HashMap().bfs(vertices,adj);
        System.out.println(bfs);
    }
    public ArrayList<Integer> bfs(int vertices,LinkedHashMap<Integer,ArrayList<Integer>> adj)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        boolean vis[]=new boolean[vertices];
        queue.add(0);
        while (!queue.isEmpty())
        {
            int cur=queue.poll();
            if (vis[cur] == true) {
                continue;
            }
            arr.add(cur);
            vis[cur]=true;
            for(Integer neighbour:adj.get(cur))
            {
                if(vis[neighbour]==false)
                {
                    queue.add(neighbour);
                }
            }
        }
        return arr;
    }
}
