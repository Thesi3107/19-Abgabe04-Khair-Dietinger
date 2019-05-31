package at.fhj.iit;

public class QueueMain {
    public static void main(String[] args){
        StringQueue q1 = new StringQueue(3);
        q1.offer("hello");
        System.out.println(q1.peek());
    }
}