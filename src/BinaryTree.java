public class BinaryTree {
    /*
    TREE: A recursive data structure where each node has any number of child
    nodes. Useful for storing tree-like data such as files and folders.

    BINARY TREE: A tree where each branch only has 0, 1, or 2 children.

    BALANCED: A binary tree is balanced if, for any node:
    |height of node's left child - height of node's right child| <= 1
    The height of a node is the maximum amount of depth it has.
    Here are the steps:
    1. If the node is null, return true (base case).

    2. If the difference between the node's left child height and right
    child height is greater than 1, return false.

    3. Return if the left child is balanced AND the right child is balanced.

    TREE HEIGHT:
    1. If the node is null, return 0 (base case).

    2. Otherwise, return 1 + max(left child's height, right child's height).
     */

    public Integer value;
    public BinaryTree left;
    public BinaryTree right;

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

    public int sum() {
        return sum(this);
    }

    private static int sum(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }
        return tree.value + sum(tree.left) + sum(tree.right);
    }

    public boolean isBalanced() {
        return isBalanced(this);
    }

    private static boolean isBalanced(BinaryTree tree) {
        if (tree == null) {
            return true;
        }

        if (Math.abs(height(tree.left) - height(tree.right)) > 1) {
            return false;
        }

        return isBalanced(tree.left) && isBalanced(tree.right);
    }

    public int height() {
        return height(this);
    }

    private static int height(BinaryTree tree) {
        if (tree == null) {
            return 0;
        }
        return 1 + Math.max(height(tree.left), height(tree.right));
    }

    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(1, 3, null);
        myTree.right = new BinaryTree(2, null, null);
        myTree.right.right = new BinaryTree(3, 4, null);
        System.out.println("Sum: " + myTree.sum());
        System.out.println("Balanced: " + myTree.isBalanced());
        System.out.println("Height: " + myTree.height());
    }

}