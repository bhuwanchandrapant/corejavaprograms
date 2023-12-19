public class MethodOverlodingExample {
    static void foo(){
        System.out.println("good morning bro!");
    }

    static void foo(int a){
        System.out.println("god morning  "  + a + " bro");
    }
     static void foo(int a ,int b){
        System.out.println("god morning   "  +a +  " bro");
        System.out.println("god morning     "  +b +  " bro");
        
     }

     public static void main(String[] args) {
        
        foo();
        foo(123);
        foo(123, 234);
     }

















}
