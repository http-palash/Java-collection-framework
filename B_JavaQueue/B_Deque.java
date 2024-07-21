package B_JavaQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class B_Deque {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq); // [30, 10, 20] used in sliding window

        dq.poll();
        System.out.println(dq);

        /*
            Adding Elements :
             addFirst(E e)
             addLast(E e)
            Removing Elements :
             removeFirst() or pollFirst
             removeLast() or pollLast
            Accessing Elements :
             getFirst or peekFirst
             getLast() or peekLast()
         */

        /*
            Stack and queue operations using ArrayDeque

            1.Stack Operations :
                push(E e)
                pop()

            2.Queue Operations :
                add(E e) or offer(E e)
                remove() or poll()


            In order to implement use arraydeque class
            dont use stacck class because it used/implements vector class which is thread safe it used lock and release
         */
    }
}
