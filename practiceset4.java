
import java.util.Scanner;

public class practiceset4 {
    public static void main(String[] args) {
       
       //question1
       /*  int a = 10;
        if (a==10) {
            System.out.println("yes");
            
        }
        else{
            System.out.println("no");
        }   */
//question2
/*byte m1,m2,m3;
Scanner sc= new Scanner(System.in);
System.out.println("please enter math nuber");
m1=sc.nextByte();
System.out.println("please enter physics nuber");
m2=sc.nextByte();
System.out.println("please enter chemestry nuber");
m3=sc.nextByte();
float avg=(m1+m2+m3)/3.0f;
System.out.println("your pecentage is "  + avg);

if (avg>=40  && m1>=33 && m2>=33 && m3>=33 ) {
    System.out.println("congratulation you are passed");
    
}
else{
    System.out.println("sorry you are not passed");

}*/

     //question3
     /*Scanner sc= new Scanner(System.in);
     System.out.println("enter your income in lakhs per annum");
     float tax = 0;
     float income = sc.nextFloat();
     if (income<=2.5) {
        tax = tax + 0;
     }
     else if (income>2.5f && income <= 5f) {
        tax = tax + 0.05f * (income - 2.5f);
     }
     else if (income> 5f && income <= 10f) {
        tax = tax + 0.05f * (5.0f -2.5f);
        tax = tax + 0.2f * (income - 5f);
     }
     else if (income > 10f) {
        tax = tax + 0.05f * (5.0f -2.5f);
        tax = tax + 0.05f * (10.0f - 5f);
        tax = tax + 0.05f * (income -10.0f);        
     }
     System.out.println("the total tax paid by the employee is  " + tax);
     */

  //// question4
/*Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
  int day = sc.nextInt();
  switch (day) {
    case 1:
        System.out.println("monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
         System.out.println("wednessday");
        break;
        case 4:
         System.out.println("thusday");
        break;
        case 5:
         System.out.println("friday");
        break;
        case 6:
         System.out.println("saturday");
        break;
        case 7:
         System.out.println("sunday");
        break;
        
    default:
    System.out.println("enjoy your life");
        break;
}*/

   // question 6


   Scanner sc = new Scanner(System.in);
   System.out.println("enter website name");
   String website = sc.next();
   if (website.endsWith(".com")) {
   System.out.println("this is an comercial website"); 
   }
    else if (website.endsWith(".org")) {
   System.out.println("this is an organizational website"); 
   }
    else if (website.endsWith(".in")) {
   System.out.println("this is an indian website"); 
   }

    }
}
