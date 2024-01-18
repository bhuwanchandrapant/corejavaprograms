
import java.util.Scanner;
public class errorsdemo {
    public static void main(String[] args) {
        //SYNTAX ERROR DEMO
        //int a = 2 // Error: no semicolan!
        // b = 10; // Error : b not declared!



        ////LOGICAL ERROR
        //write a program to print all prime numbers b/w 1 to 10

        System.out.println(2);
        for(int i = 1; i<5; i++){
            System.out.println(2*i+1);
        }

          //// RUN TIME ERROR / EXCEPTION
          System.out.println("enter number");
          int k;
          Scanner sc = new Scanner(System.in);
          k = sc.nextInt();
          System.out.println("integer part of 1000 diveded by k is  "+ 1000/k);



    }
}
