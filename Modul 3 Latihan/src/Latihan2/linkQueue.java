package Latihan2;

public class linkQueue {
    public Fifo theList;

    public linkQueue(){
        theList = new Fifo();
    }
    public boolean isEmpty(){

        return theList.isEmpty();
    }
    public void enqueue(String input){

        theList.insertLast(input);
    }
    public String dequeue(){

        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.print("Head ==> Tail\t: ");
        theList.displayList();
    }
    public String displayPeek(){

        return theList.peek();
    }
    public String displayPoll(){

        return theList.poll();
    }
}
