
class Ekclass{
    int a;

    public int getA() {
        return a;
    }
    Ekclass(int a){
        this.a = a;
    }
    public int returnnone(){
        return 1;

    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("i am a constructor");

    }
}

public class this_and_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(56);
        Doclass d = new Doclass(123);
        System.out.println(e.getA());
        
    }
}
