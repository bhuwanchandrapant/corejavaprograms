import java.util.Scanner;
public class yes {
    public static void main(String[] args) {
        System.out.println("userinput");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number");
            int a = sc.nextInt();
            System.out.println(a);
        }
    
    }
    
}
