package SDE_Sheet_Apna.Graph;

import java.util.*;
public class GraphUsingMap {


        HashMap<Integer, TreeSet<Integer>> graph;
        static int v;

        // Graph Constructor
        public GraphUsingMap()
        {
            graph = new HashMap<>();
            for(int i = 0; i < v; i++)
            {
                graph.put(i, new TreeSet<>());
            }
        }

        // Adds an edge to an undirected graph
        public void addEdge(int src, int dest)
        {
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }


        public void printGraph()
        {
            for(int i = 0; i < v; i++)
            {
                System.out.println("Adjacency list of vertex " + i);
                Iterator set = graph.get(i).iterator();

                while (set.hasNext())
                    System.out.print(set.next() + " ");

                System.out.println();
                System.out.println();
            }
        }

        // Searches for a given edge in the graph
        public void searchEdge(int src, int dest)
        {
            Iterator set = graph.get(src).iterator();

            if (graph.get(src).contains(dest))
                System.out.println("Edge from " + src + " to " +
                        dest + " found");
            else
                System.out.println("Edge from " + src + " to " +
                        dest + " not found");

            System.out.println();
        }

        // Driver code
        public static void main(String[] args)
        {
            v = 5;
            GraphUsingMap gra = new GraphUsingMap();

            gra.addEdge(0, 1);
            gra.addEdge(0, 4);
            gra.addEdge(1, 2);
            gra.addEdge(1, 3);
            gra.addEdge(1, 4);
            gra.addEdge(2, 3);
            gra.addEdge(3, 4);

            gra.printGraph();

            gra.searchEdge(2, 1);
            gra.searchEdge(0, 3);
        }
    }

