package CollectionAndGenerices.Collecttion;

import java.util.*;

public class TestingQueue {
    
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        


        // new way to print queue
       Utility.print(queue);
       System.out.println(queue.peek());
       System.out.println(queue.element());
       System.out.println(queue.remove());
       Utility.print(queue);
       System.out.println(queue.poll());
       Utility.print(queue);
            //This remove method will give exception 
    //    System.out.println(queue.remove());
       System.out.println(queue.poll());
    }
}
