package Homeworks.HW4;

// you may use this file to write and run code to test your MyArrayList class

public class Main {
    public static void main(String[] args) {

/*         // testing insertAt
        MyArrayList list0 = new MyArrayList();
        list0.addToEnd(1);
        
        printList(list0);

        list0.addToEnd(2);
        printList(list0);

        list0.insertAt(0, 0);
        printList(list0);


        // testing NoSuchElement for insertAt
        list0.insertAt(-1, -1);
        printList(list0);

        MyArrayList list1 = new MyArrayList();
        list1.insertAt(1, 99);
        printList(list1);

        printList(list0); */

        MyLinkedList list0 = new MyLinkedList();
        printList(list0);
        list0.addToEnd(3);
        printList(list0);
        list0.addToEnd(2);
        printList(list0);
        list0.addToEnd(1);
        printList(list0);

        list0.insertAt(0, 3);
        printList(list0);
        list0.insertAt(0, 2);
        printList(list0);
        list0.insertAt(0, 1);
        printList(list0);

        list0.removeAt(0);
        printList(list0);

    }

    public static void printList(MyLinkedList list){
        System.out.print(list.getSize() + ": ");
        for (int i = 0; i < list.getSize(); i++){
            System.out.print(list.getAt(i) + " ");
        }
        System.out.println(".");
    }

    public static void printList(MyArrayList list){
        System.out.print(list.getSize() + ": ");
        for (int i = 0; i < list.getSize(); i++){
            System.out.print(list.getAt(i) + " ");
        }
        System.out.println(".");
    }
}