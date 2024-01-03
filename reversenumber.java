import java.util.Scanner;

public class reversenumber {
     public static void main(String args[])
{
  Scanner SC= new Scanner(System.in);
 int n,r,reverse=0;
 System.out.println("Enter the number");
 n=SC.nextInt();
while(n>0)
{
 r=n%10;
reverse=reverse*10+r;
n=n/10;
}
System.out.println("reverse number  "+reverse);
}
}
