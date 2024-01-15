

class MyNewThr1 extends Thread{
    public MyNewThr1(String name){
      
    }
    public void run(){
        System.out.println("thank you  ");
        
     
       
    } 
}
class MyNewThr2 extends Thread{
    public MyNewThr2(String name){
        super(name);
    }
    public void run(){
        System.out.println("good morning   " );
        
        
    } 
}
public class practice_set13 {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1("hello");
        MyNewThr2 t2 = new MyNewThr2("hyy");
        t1.setPriority(9);
        t2.setPriority(8);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

    }
}
