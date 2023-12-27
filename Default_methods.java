

interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("recording in 4k");
    }
}
interface mywifi{
    String[]  getnetworks();
    void connecttonetworks(String network);

}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling "+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting......");
    }
}
class mysmartphone extends mycellphone implements mycamera,mywifi{
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


public class Default_methods {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();
        ms.record4kvideo();
        //ms.greet(); ----> throws an error.
        String[] ar = ms.getnetworks();
        for (String item: ar){
            System.out.println(item);

        }

        
    }
}
