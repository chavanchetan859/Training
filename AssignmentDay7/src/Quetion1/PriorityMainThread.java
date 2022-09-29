package Quetion1;


public class PriorityMainThread {
    public static void main(String[] args) {
        new PriorityThread("Thread 1",4);
        new PriorityThread("Thread 2",2);
        new PriorityThread("Thread 3",1);



    }
}
