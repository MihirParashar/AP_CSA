import java.util.*;

public class Graphs {
    /*
    GRAPHS: A set of vertices/nodes connected by edges.
    An edge can connect any two nodes, and a node can
    have multiple edges. They're like trees, but with
    no rules for edges.
    EXAMPLES:
    - Social graphs, where each node represents a user,
    and each edge represents friendships.
    - Transit graphs, where each node is a place, and
    each edge is a highway connecting them.

    DIRECTED GRAPH: A graph where edges are directional,
    meaning you can't always go backwards from a node.

    WEIGHTED GRAPH: A graph where each edge has its own
    weight value. This could represent many things, like
    distance, cost, or strength.

    CONNECTED GRAPH: A graph where, no matter what node you
    start from, there is always some path to any other node.
     */
    public static void main(String[] args) {
        UnweightedGraph<Integer> graph = randomUnweightedIntegerGraph(new Range(1, 5), new Range(5, 10), new Range(0, 9));
    }

    public static UnweightedGraph<Integer> randomUnweightedIntegerGraph(Range nodeCountRange, Range edgesPerNodeRange, Range nodeValueRange) {
        UnweightedGraph<Integer> graph = new UnweightedGraph<>();
        int nodeCount = nodeCountRange.random();
        int edgeCount = edgesPerNodeRange.random();
        for (int i = 0; i < nodeCount; i++) {
            int value = nodeValueRange.random();
            GraphNode<Integer> node = new GraphNode<>(value);
            graph.addNode(node);
            graph.addEdge();
        }
        return graph;
    }
}

class UnweightedGraph<T> {
    private Map<GraphNode<T>, Set<GraphNode<T>>> nodes;
    public UnweightedGraph() {
        nodes = new HashMap<>();
    }
    public Map<GraphNode<T>, Set<GraphNode<T>>> getNodes() {
        return nodes;
    }
    public void addNode(GraphNode<T> node) {
        nodes.put(node, new HashSet<>());
    }
    public void addEdge(GraphNode<T> node, GraphNode<T> neighbor) {
        nodes.get(node).add(neighbor);
    }
}

record GraphNode<T>(
        T value) {

    public Object getValue() {
        return value;
    }
}

class Range {
    private final Random random;
    public int min;
    public int max;
    public Range(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        this.min = min;
        this.max = max;
        random = new Random();
    }
    public int random() {
        return random.nextInt(max - min) + min;
    }
}