import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        int [] marks = new int[53];
        marks[0]=12;
        marks[1]=56;
        marks[2]=70;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind =  sc.nextInt();

        System.out.println("enter the num you want to divide with..");
        int number = sc.nextInt();

        try {
            System.out.println("the value at array index "+marks[ind]);
            System.out.println("the array value/number "+marks[ind]/number);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception occured....");
            System.out.println(e);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds exception occured....");
            System.out.println(e);

        }
        catch (Exception e) {
            System.out.println("some other  exception occured....");
            System.out.println(e);

        }
        

    }
}
