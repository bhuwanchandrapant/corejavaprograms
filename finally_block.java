public class finally_block {
    public static int greet(){
        try{
            int a = 10;
            int b =0;
            int c = a/b;
            return c;

        }
        catch(Exception e){
            System.out.println(e);

        }
        finally{
            System.out.println("this is the end of the program");
        }
        return -1;

    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a =7;
        int b =9;
        while (true) {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;


            }
            finally{
                System.out.println("i am finally for b= " + b );
            }
            b--;
            
        }
        try{
            System.out.println(50/3);
        }
        finally{
            System.out.println("iam finally with only try block not try_catch");
        }
        
    }
}
