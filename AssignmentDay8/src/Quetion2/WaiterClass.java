package Quetion2;

public class WaiterClass
    {
        int n;
        boolean prepared =false;
        synchronized void putPrepared(int n)
        {
            if(prepared)
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.n=n;
            prepared=true;
            System.out.println("preparing the dish: "+n);
            notify();

        }
        synchronized int getServe()
        {
            if(!prepared)
            {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("the dish is ready to serve: "+n);
            prepared=false;
            notify();
            return n;
        }


    }

