
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<=50){
            System.out.println("mythread is running");
            System.out.println("i am good");
            i++;
        }

    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<=50){
            System.out.println("thread2 is good");
            System.out.println("i am glad");
            i++;
        }

    }

    public void start() {
    }
}
public class multithred {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();


        
    }
}
