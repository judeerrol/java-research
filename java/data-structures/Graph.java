import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Adjacency List
public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }


    void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.println(node + " -> " + adjList.get(node));
        }
    }

    public static void main(String[] args) {
        // Creating Graph
        Graph g = new Graph();

        // Add edge (line) between two nodes (points)
        g.addEdge(1, 2);                //  1 -- 2 -- 4
        g.addEdge(1, 3);                //  |
        g.addEdge(2, 4);                //  3 -- 5
        g.addEdge(3, 5);

        System.out.println("Graph Representation");
        g.printGraph();
    }
}
