
class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am a overloaded constructor with value of x as: " + x);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("i am a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("i am overloaded contructor of derived with value of y as:  " + y);

    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("i am a child of derived class");
    }
    childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("i am overloaded contructor of derived with value of z as:  " + z);
    }
}


public class constructor_inheritence {
    public static void main(String[] args) {
        //base1 b = new base1();
        //derived1 d = new derived1();
        //derived1 d = new derived1(14,9);
        childofderived cd = new childofderived(12,34,56);

        
    }
}
