package B_JavaQueue;

import java.util.ArrayDeque;

public class C_Stack_Using_ArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("queue"+q);
        System.out.println(q.pop());
        System.out.println("queue"+q);

        // 3 method add from last
        q.offer(40);
        q.add(50);
        q.addLast(60);
        System.out.println(q);


        // 3 method add from front
        q.push(70);
        q.add(80);
        q.offerFirst(90);
        System.out.println(q);


        // 4 method to remove from front

        System.out.println(q.poll());
        System.out.println(q.pop());
        System.out.println(q.pollFirst());
        System.out.println(q.removeFirst());

        // 2 method to remove from last

        System.out.println(q.pollFirst());
        System.out.println(q.removeLast());

    }
}
