

class base{
    public int x;
    public int getx(){
        return x;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("iam in the base and sitting in x");
        this.x = x;
    }
    public void printme(){
        System.out.println("iam a constructor");
    }
}
    class derived extends base{
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
        
    }


public class inheritence {
    public static void main(String[] args) {
        base b = new base();
        b.setX(123);
        System.out.println(b.getX());
        derived d = new derived();
        d.setY(45);
        System.out.println(d.getY());
     
        
    }
}
