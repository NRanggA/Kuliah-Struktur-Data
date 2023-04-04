package Latihan2;

public class Fifo {
    public exampleQueue first;
    public exampleQueue last;

    public Fifo (){
        first= null;
        last = null;
    }
    public boolean isEmpty(){

        return first==null;
    }
    public void insertLast(String dataData){
        exampleQueue link = new exampleQueue(dataData);
        if (isEmpty()){
            first = link;
        }else {
            last.next = link;
        }
        last= link;
    }
    public String deleteFirst(){
        String tempData = (String) first.dataItem;
        if (first.next == null){
            last = null;
        }
        first = first.next;
        return tempData;
    }
    public void displayList(){
        exampleQueue current = first;
        while (current != null){
            current.displayLink();
            current=current.next;
        }
    }
    public String peek(){
        String tempData = first.dataItem;
        return tempData;
    }
    public String poll(){
        String tempData =  first.dataItem;
        first = first.next;
        return tempData;
    }
}
