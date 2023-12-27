
interface bicycle{
    int a = 45;
    void applybreak(int decrement);
    void speedup(int increment);

}
interface hornbicycle{
    void blowhorn3kg();
    void blowhornmhn();

}
class avoncycle implements bicycle, hornbicycle{
    void blohorn(){
        System.out.println("pee pee poo poo");
    }
    public void applybreak(int decrement){
        System.out.println("applying break");

    }
    public void speedup(int increment){
        System.out.println("applying speedup");
    }
    public void blowhorn3kg(){
        System.out.println("kabhi kushi kabhi gum pee pee peee");
    }
    public void blowhornmhn(){
        System.out.println("main hoo na poo poo poo");
    }

}

public class Interface {
    public static void main(String[] args) {
        avoncycle bhuwancycle = new avoncycle();
        bhuwancycle.applybreak(1);
        // you can create properties  in interface
       // System.out.println(bhuwancycle.a);

        // yoy cannot modify the properties in interface as they are final
       // bhuwancycle.a = 454;
        //System.out.println(bhuwancycle.a);


        bhuwancycle.blowhorn3kg();
        bhuwancycle.blowhornmhn();

    }
}
