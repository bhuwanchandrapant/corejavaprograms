
interface mycamera2{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("recording in 4k..");
    }
}
interface mywifi2{
    String[]  getnetworks();
    void connecttonetworks(String network);

}
class mycellphone2{
    void callnumber(int phonenumber){
        System.out.println("calling "+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting......");
        
    }
}
class mysmartphone2 extends mycellphone2 implements mycamera2,mywifi2{
    public void takesnap(){
        System.out.println("taking snap...");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
    public void record4kvideo(){
        System.out.println("taking snap and recording in 4k");
    }
    public String[] getnetworks(){
        System.out.println("getting list of networks");
        String [] networkslist ={"bhuwan","pant","chandra"};
        return networkslist;
    }
    public void connecttonetworks(String networks){
        System.out.println("connecting to " + networks);

    }

}



public class polymorphism {
    public static void main(String[] args) {
        mysmartphone2 ms =new mysmartphone2();
        mycamera2 cam2 = new mysmartphone2(); //this is a smartphone use it as a camera
        mywifi2 mw2 = new mysmartphone2(); //this is smartphone use it as awifi
        cam2.record4kvideo();  //
        mw2.getnetworks();
        ms.getnetworks();
        ms.callnumber(1234);
        ms.connecttonetworks("bhuwan");
        ms.getnetworks();
       



        
    }
}
