import java.util.Scanner;

public class armstrong {
     public static void main(String args[])
{
  Scanner SC =new Scanner(System.in);
int n,r,reverse=0,c;
System.out.println("enter the  number");
n=SC.nextInt();
while(n>0)
{
 r=n%10;
reverse=reverse+r*r*r;
n=n/10;
}
if(reverse==n)
System.out.println("number is armstrong");
else
System.out.println("number is not armstrong");
}
}
