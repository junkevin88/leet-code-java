package apr2023.apr082023;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node clone = new Node(node.val);
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;

    }

}
