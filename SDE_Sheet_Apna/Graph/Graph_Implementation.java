package SDE_Sheet_Apna.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
        System.out.println("\nThe distance is "+distance);
        return distance;
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

        graph.bfs(sou,desti);
    }
}
