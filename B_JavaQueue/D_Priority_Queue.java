package B_JavaQueue;

import java.util.PriorityQueue;

public class D_Priority_Queue {

    public static void main(String[] args) {

        //PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
