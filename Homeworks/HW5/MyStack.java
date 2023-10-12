package Homeworks.HW5;

import java.util.NoSuchElementException;

public class MyStack implements IStack {

    Node head;
    int size;

    public MyStack(){
        head = null;
        size = 0;
    }


    @Override
    public void push(Object item) {
        Node toAdd = new Node();
        toAdd.data = item;

        if (head == null) {
            head = toAdd;
        } else {
            toAdd.next = head;
            head = toAdd;
        }
        size++;
    }

    @Override
    public Object pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node toRemove = head;
        head = head.next;
        size--;
        return toRemove.data;
    }

    @Override
    public Object peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        return head.data;
    }

    @Override
    public int indexOf(Object item) {
        int index = -1;
        boolean found = false;

        if (head == null){
            return -1;
        }

        StackIter iter = new StackIter();

        do{
            index++;
            if (iter.next() == item){
                found = true;
            }
        }while (!found && iter.hasNext());

        if(found){
            return index;
        }else{
            return -1;
        }
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    public void printStack(){
        StackIter iter = new StackIter();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        System.out.println();
    }

    public StackIter getIterator() {
        return new StackIter();
    }

    private class StackIter  {
        Node currentNode = null;

        public Object next() {
            if (currentNode != null)
                currentNode = currentNode.next;
            else
                currentNode = head;

            return currentNode.data;
        }

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
