public class try_catch_block {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;
        //int c = a/b;
       // System.out.println("the result is "+ c);
            
            ////with try:
            try {
                int c = a/b;
                System.out.println("the result is "+c);

            } catch (Exception e) {
                System.out.println("we failed to devide , reason :");
                System.out.println(e);

            }
            System.out.println("end of program");
    }
}
