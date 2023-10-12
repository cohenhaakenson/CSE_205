package Homeworks.HW5;

import java.util.NoSuchElementException;

public class MyQueue implements IQueue{

    Node head;
    int size;

    public MyQueue(){
        head = null;
        size = 0;
    }

    @Override
    public void enqueue(Object item) {
        Node toAdd = new Node();
        toAdd.data = item;

        if(head == null){
            head = toAdd;
        }else{
            Node curNode = head;
            while (curNode.next != null){
                curNode = curNode.next;
            }
            curNode.next = toAdd;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Object d = head.data;
        head = head.next;
        size--;

        return d;

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

        QueueIter iter = new QueueIter();

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

    public void printQueue(){
        QueueIter iter = new QueueIter();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        System.out.println();
    }

    public QueueIter getIterator() {
        return new QueueIter();
    }

    private class QueueIter  {
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
