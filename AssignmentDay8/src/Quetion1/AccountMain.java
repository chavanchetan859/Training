package Quetion1;

public class AccountMain {
    public static void main(String[] args) {
        Account act=new Account();

        Thread1 t1=new Thread1(act,500);
        Thread1 t2=new Thread1(act,650);
        Thread1 t3=new Thread1(act,900);

        try{
            t1.t.join();
            t2.t.join();
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
