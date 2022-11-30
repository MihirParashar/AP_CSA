public class Trees {
    /*
    TREE: A recursive data structure where each node has any number of child
    nodes. Useful for storing tree-like data such as files and folders.

    BINARY TREE: A tree where each branch only has 0, 1, or 2 children.
     */
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(1, 2, 3);
        System.out.println(BinaryTree.sum(myTree));
    }

}

class BinaryTree {
    private Integer value;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int setValue) {
        value = setValue;
    }

    public BinaryTree(Integer setValue, Integer setLeft, Integer setRight) {
        value = setValue;
        if (setLeft == null) {
            left = null;
        } else {
            left = new BinaryTree(setLeft);
        }
        if (setRight == null) {
            right = null;
        } else {
            right = new BinaryTree(setRight);
        }
    }

    public int getValue() {
        return value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public static int sum(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }
        return tree.getValue() + sum(tree.getLeft()) + sum(tree.getRight());
    }
}
