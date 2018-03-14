public class Node {

    String value;
    Node left = null;
    Node right = null;

    public Node(String value) {

        this.value = value;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setleft(Node left) {
        this.left = left;
    }

    public String getValue() {
        return value;
    }

    public Node getRightNode() {
        return right;
    }

    public Node getLeftNode() {
        return left;
    }


    public boolean isEmpty() {
        return right == null && left == null;
    }

}
