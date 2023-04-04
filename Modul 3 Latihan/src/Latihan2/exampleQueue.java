package Latihan2;

public class exampleQueue {
    public String dataItem;
    public exampleQueue next;

    public exampleQueue (String d){
        dataItem=d;
    }

    public void displayLink(){
        System.out.print(dataItem+ " ");
    }
    public static void main(String[] args) {
        linkQueue queue = new linkQueue();
        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        System.out.println("Remove\t: "+queue.dequeue());
        System.out.println("Element\t: "+queue.displayPeek());
        System.out.println("Poll\t: "+ queue.displayPoll() );
        System.out.println("Peek\t: "+ queue.displayPeek());
    }

}
