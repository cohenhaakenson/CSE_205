package Homeworks.HW6;

public class Main {
    public static void main(String[] args) {
        MyBSTree<Integer> t = new MyBSTree<Integer>();
        t.insert(1);
        t.printInOrder();
        t.insert(-1);
        t.insert(2);
        t.insert(1);
        t.printInOrder();
        System.out.println();
        System.out.println(t.toString());
    }
}
