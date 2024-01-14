
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("thank you  " + this.getName());
        /// to check thread priorities use while loop 
       /*  while (true) {
            System.out.println("i am a thread");
            
        }*/
    } 
}public class thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("bhuwan");
        MyThr1 t2 = new MyThr1("bhuwanpant jiiii");
        MyThr1 t3 = new MyThr1("bhavesh pant");
        MyThr1 t4 = new MyThr1("KING KOHALI");
        MyThr1 t5 = new MyThr1("bhuwan chandra pant");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        

        
        
    }
}
