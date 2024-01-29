import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString(){
        return "iam tostring";
    }

    @Override
    public  String getMessage(){
        return "i am getmessage";

    }
}

public class custom_exception {
    public static void main(String[] args) {
        System.out.println("enter number");
        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9) {
            try{
                //throw new Myexception();
                throw new ArithmeticException("this is arithmetic exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();

            }
            System.out.println("yes finished");
        }
        
    }
}
