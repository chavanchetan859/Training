package Quetion2;

public class OddEvenClass extends Thread{
    private String name;
    Thread t;
    OddEvenClass(String name) {
        super(name);
        this.name=name;
        t=new Thread(this,"thread Odd/Even");
        System.out.println(this.name +" is created2");
        t.start();
    }

    @Override
    public void run() {

        TableFiveClass tf=new TableFiveClass("Thread: Table Five: ");
        try {

            for(int i=1;i<=5;i++) {
                if(((tf.num)%2)==0 )
                {
                    System.out.println(this.name +" Even Running2.. " + tf.num);
                }
                else if(tf.num%2==1&&tf.isAlive()) {
                    System.out.println(this.name +" Odd Running2.. " + tf.num);
                    tf.join(1000);
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name +" interupted2..");
        }
        System.out.println(this.name +"  Finished2..");
    }


}
