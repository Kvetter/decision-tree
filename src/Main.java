import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        ArrayList<int[]> list = new ArrayList();
        list.add(new int[] {0, 1, 1, 1});
        list.add(new int[] {1, 1, 1, 1});
        list.add(new int[] {1, 0, 1, 0});
        list.add(new int[] {0, 1, 0, 0});
        list.add(new int[] {1, 1, 1, 0});
        list.add(new int[] {1, 0, 1, 1});
        list.add(new int[] {1, 1, 0, 1});
        list.add(new int[] {1, 0, 0, 1});
        list.add(new int[] {1, 1, 0, 0});

    DecisionTree tree = new DecisionTree();

        for (int[] arr : list) {
            System.out.println(tree.findValue(arr));
        }
}

}
