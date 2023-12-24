
class cylinder{
    private int radius;
    private int height;
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

}


public class practicesetSet9 {
    public static void main(String[] args) {
        cylinder mCylinder = new cylinder();
        mCylinder.setHeight(123);
        System.out.println(mCylinder.getHeight());
        mCylinder.setRadius(1234);
        System.out.println(mCylinder.getRadius());
    }
    
}
