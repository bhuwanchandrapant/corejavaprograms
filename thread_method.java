

class MyNewThr1 extends Thread{
    public MyNewThr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        /// to check thread priorities use while loop 
       /*  while (true) {
            System.out.println("i am a thread");
            
        }*/
    } 
}
class MyNewThr2 extends Thread{
    public MyNewThr2(String name){
        super(name);
    }
    public void run(){
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        System.out.println("thank you  " + this.getName());
        /// to check thread priorities use while loop 
       /*  while (true) {
            System.out.println("i am a thread");
            
        }*/
    } 
}

public class thread_method {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1("bhuwan");
        MyNewThr2 t2 = new MyNewThr2("pant");
        t1.start();


        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        t2.start();

        
    }
}
