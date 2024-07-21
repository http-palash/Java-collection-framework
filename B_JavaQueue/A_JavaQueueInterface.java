package B_JavaQueue;

import java.util.LinkedList;
import java.util.Queue;

public class A_JavaQueueInterface {

    /*
        The queue interface of the java collection framework provides the functionality
        of the queue data structure. It extends the collection interface

        Follows Fifo


        Methods Queue Interface:

        boolean add(E e)
        boolean offer(E e)
        E remove()
        E poll()
        E element()
        E peek()
     */

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());// will through exception



    }

}
