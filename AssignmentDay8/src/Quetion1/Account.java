package Quetion1;

public class Account {
    //synchronized void withdraw(int amt)
    public void withdraw(int amt) {
        int balance=1000;
        System.out.println("Transaction Started");
        if(balance>=amt)
        {
            balance=balance-amt;
            System.out.println("Available balance--"+balance);
        }
        else {
           System.out.println("Not sufficient balance");
        }
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Transaction complete");
    }
}
