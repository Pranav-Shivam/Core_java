package SDE_Sheet_Apna.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph_Implementation {
    private LinkedList<Integer> adj[];
    public Graph_Implementation(int v)
    {
        adj=new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int source,int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public int bfs(int source,int destination)
    {
        int distance=0;
        boolean vis[]=new boolean[adj.length];
        int parent[]=new int[adj.length];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        parent[source]=-1;
        vis[source]=true;
        while (!queue.isEmpty())
        {
            int cur=queue.poll();
            if (cur == destination) {
                break;
            }
            for(int neighbor:adj[cur])
            {
                if (!vis[neighbor]) {
                    vis[neighbor]=true;
                    queue.add(neighbor);
                    parent[neighbor]=cur;
                }
            }
        }
        int cur=destination;
        while (parent[cur]!=-1)
        {
            System.out.print(cur+" - > ");
            distance++;
            cur=parent[cur];
        }
        System.out.print(source);
        System.out.println("\nThe distance is "+distance);
        return distance;
    }
    private boolean helperDfs(int source,int destination, boolean vis[])
    {
        if(source==destination)
        {
            return true;
        }
        for (int neighbour:adj[source])
        {
            if(!vis[neighbour])
            {
                vis[neighbour]=true;
                boolean isConnected=helperDfs(neighbour,destination,vis);
                if(isConnected)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int source,int destination)
    {
        boolean vis[]=new boolean[adj.length];
        vis[source]=true;
        return helperDfs(source,destination,vis);
    }
    public boolean stackDfs(int source,int destination)
    {
        boolean vis[]=new boolean[adj.length];
        vis[source]=true;
        Stack<Integer> st=new Stack<>();
        st.push(source);
        while(!st.isEmpty())
        {
            int cur=st.pop();
            if(cur==destination)
            {
                return true;
            }
            for (int neighbor:adj[cur])
            {
                if(!vis[neighbor])
                {
                    vis[neighbor]=true;
                    st.push(neighbor);
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices ");
        int vertices=sc.nextInt();
        System.out.println("Enter no of edges");
        int edge=sc.nextInt();
        Graph_Implementation graph=new Graph_Implementation(vertices);
        System.out.println("Enter no "+ edge+" edges");
        for (int i=0;i<edge;i++)
        {
            int source=sc.nextInt();
            int destination=sc.nextInt();
            graph.addEdge(source,destination);
        }
        System.out.println("Enter the source and destination for whose path you want find : ");
        int sou=sc.nextInt();
        int desti=sc.nextInt();
        //bfs
        //graph.bfs(sou,desti);
        //dfs  using stack
        System.out.println(graph.stackDfs(sou,desti));
        //dfs using recursion
        System.out.println(graph.dfs(sou,desti));
    }
}
