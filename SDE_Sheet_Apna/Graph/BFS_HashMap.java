package SDE_Sheet_Apna.Graph;


import java.util.*;

public class BFS_HashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vertices= sc.nextInt();
        int edges=sc.nextInt();
        HashMap<Integer, TreeSet<Integer>> adj=new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adj.put(i, new TreeSet<>());
        }
        for (int i = 0; i < edges; i++) {

            int edgeVal = sc.nextInt();
            int srcVertex = sc.nextInt();
            //int srcVertex=(int)src.getValue();
            adj.get(srcVertex).add(edgeVal);
            adj.get(edgeVal).add(srcVertex);
        }
        new BFS_HashMap().printGraph(vertices,adj);
        TreeSet<Integer> bfs=new BFS_HashMap().bfs(vertices,adj);
        //System.out.println(bfs);

    }
    public TreeSet<Integer> bfs(int vertices,HashMap<Integer,TreeSet<Integer>> adj)
    {
        TreeSet<Integer> arr=new TreeSet<>();
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
    public void printGraph(int v,HashMap<Integer, TreeSet<Integer>> graph)
    {
        for(int i = 0; i < v; i++)
        {
            System.out.println("Adjacency list of vertex " + i);
            Iterator set = graph.get(i).iterator();

            while (set.hasNext())
                System.out.print(set.next() + " ");

            System.out.println();

        }
    }
}
