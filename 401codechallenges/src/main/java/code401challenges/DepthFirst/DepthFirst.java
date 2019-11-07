package code401challenges.DepthFirst;

public class DepthFirst(LinkedList<T> adjList) {




}

    // Method preOrder returns ordered array
    public ArrayList<T> preOrder() {
        ArrayList<T> values = new ArrayList<>();
        return preOrder(this.root, values);
    }

    // Helper method for preOrder traversal
    private ArrayList<T> preOrder(Node currentNode, ArrayList<T> values) {
        if (currentNode == null) {
            return values;
        }
        values.add((T) currentNode.value);
        values = preOrder(currentNode.leftChild, values);
        values = preOrder(currentNode.rightChild, values);
        return values;
    }