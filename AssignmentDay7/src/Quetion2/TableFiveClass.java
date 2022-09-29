package Quetion2;
public class TableFiveClass extends Thread{
    private String name;
    public int num;
    Thread t;
    TableFiveClass(String name) {
        super(name);
        this.name=name;
        t=new Thread(this,"thread");
        System.out.println(this.name +" created");
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=1;i<=5;i++) {
                num=5*i;
                System.out.println(this.name +" Running.. " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name +" interupted..");
        }
        System.out.println(this.name +" Finished..");
    }

}
