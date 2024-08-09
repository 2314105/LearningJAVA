import java.util.Queue;
import java.util.LinkedList;

public class DataStructresQueues {

    public static void main(String[] args) {

//        Queus = FIFO data structre which is first in first out like a line at a store
//                  A collection designed for holding elements prior to processing
//                  Linear data structres.

//                  add = enqueue, offer()
//                  remove = dequeue, pull()


        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty()); //Checks if queue is empty

        queue.offer("Carrot"); // Instead of using add, remove and element we use offer, poll and peek
        queue.offer("Banana");
        queue.offer("Potato");
        queue.offer("Apple");

        System.out.println(queue.size()); // Checks the size of the queue
        System.out.println(queue.contains("Banana")); // Checks the queue for an object
        System.out.println(queue.peek()); // Shows whats at the front of the queue
        queue.poll(); // Removes the first in the line so carrot would be removed

        System.out.println(queue);

    }

}
