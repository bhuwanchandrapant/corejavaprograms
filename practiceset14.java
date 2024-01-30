import java.util.Scanner;

public class practiceset14 {
    public static void main(String[] args) {
        ///question2
        try{
            int a =  666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch(ArithmeticException e ){
            System.out.println("haha");

        }


        ////question3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 77;
        marks[2] = 27;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        System.out.println("enter the value of index");
        while (flag && i<5) {
            try{
                index = sc.nextInt();
            System.out.println("the value of [index] is " +marks[index]);
            break;



            }
            catch(Exception e){
                System.out.println("invalid index");
                i++;
            }
            
        }
        if (i>=5) {
            System.out.println("Errors");
            
        }

    }
}
