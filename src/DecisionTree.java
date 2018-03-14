public class DecisionTree {

    Node root;
    Node subtree;

    public DecisionTree () {

        root = new Node("Hand In");
        root.setRight(new Node("Fail"));
        root.setleft(new Node("Read"));
        root.getLeftNode().setRight(new Node("Attend"));
        root.getLeftNode().getRightNode().setRight(new Node("Fail no read and no attend"));
        root.getLeftNode().getRightNode().setleft(new Node("Pass"));
        root.getLeftNode().setleft(new Node("Attend"));
        root.getLeftNode().getLeftNode().setRight(new Node("Make"));
        root.getLeftNode().getLeftNode().getRightNode().setRight(new Node("Fail no make and no attend"));
        root.getLeftNode().getLeftNode().getRightNode().setleft(new Node ("Pass"));
        root.getLeftNode().getLeftNode().setleft(new Node("Pass"));

    }

    public String findValue(int[] arr) {
        subtree = root;
        for (int num : arr) {
            if (subtree.isEmpty()) {
                return subtree.getValue();
            } else if (num == 0) {
                subtree = subtree.getRightNode();
            } else {
                subtree = subtree.getLeftNode();
            }
        }
        return subtree.getValue();
    }



}
