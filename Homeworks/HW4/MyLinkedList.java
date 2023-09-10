package Homeworks.HW4;

import java.util.NoSuchElementException;

// Complete the implementation of your MyLinkedList class in this file

public class MyLinkedList implements MyList {
    // Implement the required fields and methods here
    private Node head;
    private int size;

    /*
     * Default constructor initializes values
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /*
     * Adds Object to end of list
     * 
     * @param Object o Object to add
     */
    @Override
    public void addToEnd(Object o) {
        Node currNode = head; // starts at head
        Node toAdd = new Node(); // creates new Node to add
        toAdd.data = o; // sets value of new Node

        if (size == 0) {
            head = toAdd;
            size++;
        } else {
            // gets last Node in list
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            // adds in new Node
            currNode.next = toAdd;
            size++;
        }

    }

    /*
     * Inserts a new Node at a specified index
     * 
     * @param int index position to add Node
     * 
     * @param Object o data to add to list
     * 
     * @throws NoSuchElementException if index is less than 0 or greater than size
     */
    @Override
    public void insertAt(int index, Object o) {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        }

        Node currNode = head;
        int currIndex = 0;

        Node toAdd = new Node();
        toAdd.data = o;

        if (currNode == null) {
            head = toAdd;
            size++;
        } else if (index == 0) {
            toAdd.next = head;
            head = toAdd;
            size++;
        } else {
            while (currIndex < index - 1) {
                currNode = currNode.next;
                currIndex++;
            }

            toAdd.next = currNode.next;
            currNode.next = toAdd;
            size++;

        }

    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }

        Node currNode = head;
        int currIndex = 0;

        if (index == 0) {
            head = head.next;
            size--;
        } else {
            while (currIndex < index - 1) {
                currNode = currNode.next;
                currIndex++;
            }

            currNode.next = currNode.next.next;
            size--;

        }
    }

    @Override
    public Object getAt(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }

        MyLinkedListIterator iter = new MyLinkedListIterator();

        for (int i = 0; i < index; i++) {
            iter.next();
        }

        return iter.next();
    }

    @Override
    public int getSize() {
        return size;
    }

    // Do not alter the code below

    public MyListIterator getIterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements MyListIterator {
        Node currentNode = null;

        @Override
        public Object next() {
            if (currentNode != null)
                currentNode = currentNode.next;
            else
                currentNode = head;

            return currentNode.data;
        }

        @Override
        public boolean hasNext() {
            if (currentNode != null)
                return currentNode.next != null;
            else
                return head != null;
        }
    }

    class Node {
        public Object data = null;
        public Node next = null;
    }

}