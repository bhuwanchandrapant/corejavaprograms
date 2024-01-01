import java.util.Scanner;

public class billing {
      public static void main(String args[])
{
  int u;
  double b;
Scanner SC=new Scanner(System.in);
System.out.println("Enter unit");
u=SC.nextInt();
if(u>=0 && u<=100)
b=100;
else if(u>=100 && u<=200)
b=100+(u-100)*2;
else if(u>=200 && u<=400)
b=100+200+(u-200)*3;
else if(u>=400 && u<=600)
b=100+200+600+(u-400)*4;
else 
b=100+200+600+1600+(u-800)*5;
System.out.println("for unit " +u+"bill = " +b);
}
}
