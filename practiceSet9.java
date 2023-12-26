
class circle{
    public int redious;
    circle(){
        System.out.println("i am non parameterised of circle");
    }
    circle(int r){
        System.out.println("i am circle parameterised constructor");
        this.redious = r;
    }
    public double area(){
        return Math.PI *this.redious * this.redious;
    }
}

class cylinder1 extends circle{
    public int height;
    cylinder1(int r, int h){
        super(r);
        System.out.println("i am a cylinder1 parameterised constructor");
        this.height = h;

    }
    public double volume(){
        return Math.PI*this.redious*this.redious*this.height;

    }
}


public class practiceSet9 {
    public static void main(String[] args) {
        cylinder1 c1= new cylinder1(12, 04);
        
        c1.volume();
        c1.area();

        System.out.println(c1.volume());
        System.out.println(c1.area());


       
    }
}
