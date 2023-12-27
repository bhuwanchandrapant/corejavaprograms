
abstract class parent2{
    public parent2(){
        System.out.println("mai parent2 ka constructor hoon");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();

}
class child2 extends parent2{
    public void greet(){
        System.out.println("hyy good morning");

    }
    public void greet2(){
        System.out.println("good afternoon");

    }
}
abstract class child3 extends parent2{

    public void th(){
        System.out.println("iam good");

    }
}

public class abstractClass {
    public  static void main(String[] args) {
        child2 c = new child2();
       // parent2 p = new parent2();  //not allowed 
        c.greet();
        c.greet2();
        

        
    }
}
