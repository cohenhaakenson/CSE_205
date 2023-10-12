package Homeworks.HW6;

public class MyBSTree<T extends Comparable<T>> implements ITree<T> {

    private Node root;
    private int size;

    public MyBSTree() {
        root = null;
        size = 0;
    }

    @Override
    public void insert(T item) {
        if (this.containsItem(item)) {
            return;
        }

        Node toAdd = new Node(item);

        if (root == null) { // if tree is empty toAdd is root
            root = toAdd;
            size++;
            return;
        }

        Node loc = root; // loc tracks current loc
        Node parent = null; // tracks parent of loc
        boolean left = true; // track if we last went left or right (true is left)

        while (loc != null) {
            parent = loc; // updates parent
            if (item.compareTo(loc.data) == 1) { // item is greater -> go right
                loc = loc.right;
                left = false;
            } else { // item is lower -> go left
                loc = loc.left;
                left = true;
            }
        }

        if (left) { // if we last went left
            parent.left = toAdd;
        } else { // if we last went right
            parent.right = toAdd;
        }
        size++;

    }

    @Override
    public boolean containsItem(T item) {

        if (root == null) { // if tree is empty
            return false;
        }

        Node loc = root;
        while (loc != null) {
            if (item.compareTo(loc.data) == 0) { // if loc == item return true
                return true;
            }

            if (item.compareTo(loc.data) == 1) { // item is greater -> go right
                loc = loc.right;
            } else { // item is less -> go left
                loc = loc.left;
            }
        }
        // while loop completes and item is not found -> return false
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printInOrder() {
        inOrderPrint(root);
    }

    private void inOrderPrint(Node n) {
        if (n == null) {
            return;
        }

        inOrderPrint(n.left);
        System.out.printf("%s ", n.data);
        inOrderPrint(n.right);
    }

    public String toString() {
        return inOrderString(root);
    }

    private String inOrderString(Node n) {
        String s = "";
        if (n == null) {
            return "";
        }

        s += inOrderString(n.left);
        s += n.toString() + " ";
        s += inOrderString(n.right);
        return s;
    }

    class Node {
        public T data;
        public Node left;
        public Node right;

        public Node() {
            data = null;
            left = null;
            right = null;
        }

        public Node(T d) {
            data = d;
            left = null;
            right = null;
        }

        public void insert(T item) {
            if (!this.containsItem(item)) {
                insert(this, item);
                size++;
            }
        }

        public Node insert(Node n, T item) {
            if (n == null) {
                n = new Node(item);
                return n;
            } else if (item.compareTo(n.data) == -1) {
                n.left = insert(n.left, item);
            } else if (item.compareTo(n.data) == 1) {
                n.right = insert(n.right, item);
            }
            return n;
        }

        public String toString() {
            return data.toString();
        }

        public boolean containsItem(T item) {

            if (root == null) { // if tree is empty
                return false;
            }

            Node loc = root;
            while (loc != null) {
                if (item.compareTo(loc.data) == 0) { // if loc == item return true
                    return true;
                }

                if (item.compareTo(loc.data) == 1) { // item is greater -> go right
                    loc = loc.right;
                } else { // item is less -> go left
                    loc = loc.left;
                }
            }
            // while loop completes and item is not found -> return false
            return false;
        }

    }

}