
abstract class pen{
    abstract void write();
    abstract void rifil();

}
 class fountainpen extends pen{
    void write(){
        System.out.println("write");

    }
    void rifil(){
        System.out.println("rifil");
    }
    void changenip(){
        System.out.println("changing nip");

    }
 }

class monkey{
    void jump(){
        System.out.println("jumping japang jampak jampak....");
    }
    void bite(){
        System.out.println("biting ooooo ijyaa meriiii kati halyo....");
    }

}
interface basicanimal{
    void eat();
    void sleep();

}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("hello sir!...");
    }
       public void eat(){
        System.out.println("eating....");

       }
       public void sleep(){
        System.out.println("sleeping");

       }
}


public class practice_set11 {
    public static void main(String[] args) {
        
     ///question 1 +2
    fountainpen p = new fountainpen();
    p.changenip();
    monkey m = new monkey();
    m.jump();
    m.bite();
     ////question 3
     human bhuwan = new human();
     bhuwan.eat();
     bhuwan.sleep();

    }
}
