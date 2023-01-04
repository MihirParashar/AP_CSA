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

    UNDIRECTED GRAPH: A graph where edges are undirectional,
    meaning an edge can be traversed both ways.

    WEIGHTED GRAPH: A graph where each edge has its own
    weight value. This could represent many things, like
    distance, cost, or strength.

    CONNECTED GRAPH: A graph where, no matter what node you
    start from, there is always some path to any other node.
     */
    public static void main(String[] args) {
        UnweightedGraph<Integer> graph = randomUnweightedIntegerGraph(new Range(2, 6), new Range(0, 100), 0.7, false);
        for (Node<Integer> node : graph.getNodes()) {
            System.out.println("Node: " + node.value);
            StringBuilder neighborsList = new StringBuilder("Neighbors: ");
            for (Node<Integer> neighbor : node.getNeighbors()) {
                neighborsList.append(neighbor.value).append(" ");
            }
            System.out.println(neighborsList);
        }
        System.out.println("Undirected? " + isUndirected(graph));
    }

    private static boolean isUndirected(UnweightedGraph<?> graph) {
        for (Node<?> node : graph.getNodes()) {
            for (Node<?> neighbor : node.getNeighbors()) {
                if (!neighbor.getNeighbors().contains(node)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static UnweightedGraph<Integer> randomUnweightedIntegerGraph(Range nodeCountRange, Range nodeValueRange, double density, boolean undirected) {
        if (density < 0 || density > 1) {
            throw new IllegalArgumentException("density must be between 0 and 1");
        }
        UnweightedGraph<Integer> graph = new UnweightedGraph<>();
        Random random = new Random();
        int nodeCount = nodeCountRange.random();
        for (int i = 0; i < nodeCount; i++) {
            int value = nodeValueRange.random();
            Node<Integer> node = new Node<>(value);
            graph.addNode(node);
        }

        for (Node<Integer> node : graph.getNodes()) {
            for (Node<Integer> otherNode : graph.getNodes()) {
                if (node.equals(otherNode)) continue;

                double randomValue = random.nextDouble();
                if (randomValue >= density) continue;

                node.addNeighbor(otherNode);
                if (!undirected) continue;
                otherNode.addNeighbor(node);
            }
        }

        return graph;
    }
}

class Node<T> {
    public T value;
    private final Set<Node<T>> neighbors;
    public Node(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }
    public void addNeighbor(Node<T> neighbor) {
        neighbors.add(neighbor);
    }
    public Set<Node<T>> getNeighbors() {
        return neighbors;
    }
}

class UnweightedGraph<T> {
    private final Set<Node<T>> nodes;
    public UnweightedGraph() {
        nodes = new HashSet<>();
    }
    public Set<Node<T>> getNodes() {
        return nodes;
    }
    public void addNode(Node<T> node) {
        nodes.add(node);
    }
}

class Range {
    private final Random random;
    private final int min;
    private final int max;
    public Range(int minInclusive, int maxExclusive) {
        if (minInclusive >= maxExclusive) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        min = minInclusive;
        max = maxExclusive;
        random = new Random();
    }
    public int random() {
        return random.nextInt(max - min) + min;
    }
}