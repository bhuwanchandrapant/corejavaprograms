
class Phone{
    public void on(){
     System.out.println("turning on phone ");

    }
    public void showtime(){
        System.out.println("the time is 8am...");
    }
}
 class smartphone extends Phone{

    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("turning on smartphone .....");
    } 
 }



public class DynamicMethodDispatch {
    public static void main(String[] args) {
       // Phone p = new Phone(); // allowed
       // p.on();
        //p.showtime();
        //smartphone sp = new smartphone(); //allowed 
         Phone p = new smartphone(); //allowed 
        // smartphone sp =new Phone(); /// not allowed
         p.showtime();
         p.on();
         //p.music();  // not allowed

        //sp.on();
        //sp.showtime();
        
    }
}
