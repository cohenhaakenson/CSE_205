package Homeworks.HW5;

public class Main {
    public static void main(String[] args) {        
        // MyStack stk = new MyStack();
        // stk.push(3);
        // stk.push(2);
        // stk.push(1);
        // stk.printStack();
        // System.out.println(stk.indexOf(3));
        // System.out.println(stk.indexOf(99));

        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.printQueue();
        System.out.println(q.peek());
        q.printQueue();
        System.out.println(q.indexOf(2));
        System.out.println(q.indexOf(99));
        q.dequeue();
        q.printQueue();
    }

}
