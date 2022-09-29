package Quetion1;

public class PriorityThread extends Thread{
    private String name;
    Thread t;

    PriorityThread(String name,int priority) {
        super(name);
        this.name=name;
        setPriority(priority);
        t=new Thread(this,"thread 1");

        System.out.println(this.name +" is created");
        t.start();
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            for(int i=0;i<5;i++) {
                System.out.println(this.name +"is Running..");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(this.name +"is Finished..");

    }

}














