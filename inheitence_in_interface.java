
interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface{
    void meth3();
    void meth4();

}
class mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println("method1..");
    }
    public void meth2(){
        System.out.println("method2..");
    }
    public void meth3(){
        System.out.println("method3..");
    }
    public void meth4(){
        System.out.println("method4..");
    }
}
public class inheitence_in_interface {
    public static void main(String[] args) {
        mysampleclass mc = new mysampleclass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
        mc.meth4();

        
    }
}
