package Quetion2;

public class ChefClass implements Runnable{
    Thread t;
    WaiterClass q;
    public ChefClass(WaiterClass q)
    {
        this.q=q;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(i<8)
        {
            q.putPrepared(i++);
        }

    }

}