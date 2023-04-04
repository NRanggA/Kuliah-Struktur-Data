package Latihan2;

import java.util.LinkedList;
import java.util.Queue;
public class exampleQueueOri {
    public void exampleQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("PHP");
        queue.offer("HTML");
        queue.offer("DotNet");
        System.out.println("Remove\t: "+ queue.remove());
        System.out.println("Element\t: "+ queue.element());
        System.out.println("Poll\t: "+queue.poll());
        System.out.println("Peek\t: "+ queue.peek());
    }
    public static void main(String[] args) throws Exception {
        exampleQueueOri exampleQueueOri = new exampleQueueOri();
        exampleQueueOri.exampleQueue();
    }
}