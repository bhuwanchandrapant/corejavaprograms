
class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("i am thread 1 not// thred");
        System.out.println("i am thread 1 not thred");
        System.out.println("i am thread 1 not thred");
        System.out.println("i am thread 1 not //thred");
        System.out.println("i am thread 1 not thred");
        System.out.println("i am thread 1 not /thred");
        System.out.println("i am thread 1 not thred");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        System.out.println("iam thread2 not thread");
        

    }
}

public class runableinteraface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
