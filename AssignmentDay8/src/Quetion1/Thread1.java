package Quetion1;

public class Thread1 implements Runnable {

    Account act1;
    int amt;
    Thread t;
    public Thread1(Account act1,int amt){
        this.act1=act1;
        this.amt=amt;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
            act1.withdraw(amt);

    }
}
