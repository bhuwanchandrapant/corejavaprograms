
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 35;
        System.out.println("thank you so much.....");

       /*  while (true) {
            System.out.println("i am a thread");
            
        }*/
    } 
}


public class thread_constructor {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("bhuwan");
        MyThr1 t2 = new MyThr1("chandra");
        t1.start();
        t2.start();
        System.out.println("the id of thread t is " + t1.getId());
        System.out.println("the id of thread t is " + t1.getName());
        System.out.println("the id of thread t is " + t2.getId());
        System.out.println("the id of thread t is " + t2.getName());


        
    }
}
