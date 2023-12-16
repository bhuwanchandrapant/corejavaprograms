
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
          // switch case
        switch (age) {
            case 20:
                System.out.println("you are adult");
                break;
                case 30:
                System.out.println("you are going to be senior");
                break;
                case 50:
                System.out.println("you are retired");
            default:
            System.out.println("enjoy your life");
                break;
        }
        
         //if-else-if
         if (age>56) {
            System.out.println("you are old man");
            
        }
        else if (age >46 ) {
            System.out.println("you are elder");
            
        }
        else if (age>36) {
            System.out.println("you are young");

        }
        else{
            System.out.println("hyyyy buddy ");

        }
    
         //if-else 
        if (age>=18) {
            System.out.println("yes you can drive");
        }
        else{
            System.out.println("no you cannot drive yet");
            
        }
    }
}
