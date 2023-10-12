package Homeworks.HW4;

import java.util.NoSuchElementException;

// Complete the implementation of your MyArrayList class in this file

public class MyArrayList implements MyList {
    // Implement the required fields and methods here
    private int capacity;
    private int size;
    private Object[] storage;

    public MyArrayList() {
        capacity = 8;
        size = 0;
        storage = new Object[capacity];
    }

    /*
     * changes the capacity of MyArrayList
     * 
     * @param int minCapacity new capacity value
     */
    public void makeCapacity(int minCapacity) {
        // if minCapacity is greater than or equal to size
        // AND if minCapacity != current capacity
        if (minCapacity >= size && minCapacity != capacity) {
            // if minCapacity is greater than 8
            if (minCapacity > 8) {
                // set capacity to minCapacity
                capacity = minCapacity;
            }
            // if minCapacity is less than 8
            else {
                // set capacity to default 8
                capacity = 8;
            }
            // new Object array of new capacity size
            Object[] newArray = new Object[capacity];

            // for each Object in storage -> add to new array
            for (int i = 0; i < size; i++) {
                newArray[i] = storage[i];
            }

            // set storage to new larger array
            storage = newArray;
        }
    }

    /*
     * Removes any excess capacity
     * calls makeCapacity with current size value
     */
    public void trimExcess() {
        makeCapacity(size);
    }

    /*
     * Overrides MyList addToEnd
     * Appends new item to the end of the list
     * 
     * @param Object o Object to add to list
     */
    @Override
    public void addToEnd(Object o) {

        // if current list size is at capacity
        if (size == capacity) {
            // double capacity
            makeCapacity(capacity * 2);
        }
        // add Object o to next available index
        storage[size] = o;
        // increase size;
        size++;

    }

    /*
     * Inserts and Object o at a specified index index
     * 
     * @param int index index of added element
     * 
     * @param Object o Object to be added
     */
    @Override
    public void insertAt(int index, Object o) throws NoSuchElementException {

        if (index > size || index < 0) {
            throw new NoSuchElementException();
        }

        // if array is full -> double capacity
        if (size == capacity) {
            makeCapacity(capacity * 2);
        }

        // starting at end of array (first empty element) down to the index, 
        // move previous item to i
        for (int i = size; i > index; i--) {
            storage[i] = storage[i - 1];
        }

        storage[index] = o;
        size++;

    }


    /*
     * Removes an Object at index
     * 
     * @param int index index to be removed from list
     */
    @Override
    public void removeAt(int index) {
        if (index >= size || index < 0) {
            throw new NoSuchElementException();
        }
        for (int i = index; i < size - 1; i++) {
            storage[i] = storage[i + 1];
        }
        size--;
    }

    /*
     * Returns Object at specified index
     * 
     * @param int index index of item to return
     * 
     * @return Object Object at index
     */
    @Override
    public Object getAt(int index) {
        if (index >= size || index < 0) {
            throw new NoSuchElementException();
        }
        return storage[index];
    }

    /*
     * Returns current list size
     */
    @Override
    public int getSize() {
        return size;
    }

    // Do not alter the code below
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }

}