
class cylinder{
    private int radius;
    private int height;
    
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI* radius * radius * height; 
    }

}
class rectangle{
    private int length;
    private int breadth;

     public rectangle(){
        this.length = 4;
        this.breadth = 5;


     }


    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public int getLength() {
        return length;
    }


    public int getBreadth() {
        return breadth;
    }
        

}


public class practicesetSet9 {
    public static void main(String[] args) {

         ///question 1
        cylinder mCylinder = new cylinder(9,12);
        mCylinder.setHeight(12);
        System.out.println(mCylinder.getHeight());
        mCylinder.setRadius(9);
        System.out.println(mCylinder.getRadius());

        ///question 2
        System.out.println(mCylinder.surfaceArea());
        System.out.println(mCylinder.volume());

        //question 3
        rectangle r = new rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        
    }
    
}
