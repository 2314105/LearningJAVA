import java.util.*;

public class DataStructuresPriorityQueue {

    public static void main(String[] args) {

//        PriorityQueue = FIFO Which is a first in first out data structure which servers elements
//                          with the highest priorities first before elements with lower priority.


//        Queue<Double> queue = new PriorityQueue<>(); // queue in ascending order
//      Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // queue in descending order
//
//        queue.offer(3.0);
//        queue.offer(4.5);
//        queue.offer(5.2);
//        queue.offer(5.9);
//        queue.offer(4.8);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//
//        }


        Queue<String> queue = new PriorityQueue<>(); // queue in ascending order
//      Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); // queue in descending order


        queue.offer("F");
        queue.offer("E");
        queue.offer("A");
        queue.offer("C");
        queue.offer("B");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }



    }

}
