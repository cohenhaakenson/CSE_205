package Homeworks.HW4;

import java.util.NoSuchElementException;

public class MyLinkedList1 {
    private Node head = null;
    private int size = 0;
   
    public void addToEnd(Object element){
        Node newNode = new Node();
        newNode.data = element;

        Node currentNode = new Node();
        currentNode = this.head;

        if(head == null)
            head = newNode;
        else{
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        ++size;
    }

    public void insertAt(int index, Object element) {
        if(index < 0 || index > this.size)
            throw new NoSuchElementException();

        Node newNode = new Node();
        newNode.data = element;

        int currentIndex = 0;

        if(head == null)
            head = newNode;

        if(head != null && index == 0){
            newNode.next = head;
            head = newNode;
        }

        else{
            Node currentNode = new Node();
            currentNode = head;

            while(currentIndex < index - 1){
                currentNode = currentNode.next;
                ++currentIndex;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        ++size;
    }
    
    public void removeAt(int index){
        if(index < 0 || index >= this.size)
            throw new NoSuchElementException();
        else{
            Node currentNode = new Node();
            int currentIndex = 0;
            
            if(index == 0)
               head = head.next;
               
            else{
               while(currentIndex < index - 1){
                  currentNode = currentNode.next;
                  ++currentIndex;
               }
               currentNode.next = currentNode.next.next;
            }
            
            --size;
        }
    }

    public Object getAt(int index){
        if(index < 0 || index >= this.size)
            throw new NoSuchElementException();
        else{
            MyLinkedListIterator iter = new MyLinkedListIterator();
            
            for(int i = 0; i < index; i++){
                iter.next();
            }

            return iter.next();
        }

    }

    public int getSize(){
        return this.size;
    }

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
