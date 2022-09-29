package Quetion2;

    public class CustomerClass implements Runnable {
        Thread t;
        WaiterClass q;
        public CustomerClass(WaiterClass q)
        {
            this.q=q;
            t=new Thread(this);
            t.start();
        }
        @Override
        public void run() {
            int i=0;
            while(i<1)
            {
                q.getServe();
                i++;
            }

        }

    }

