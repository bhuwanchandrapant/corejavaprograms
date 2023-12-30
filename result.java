import java.util.Scanner;

public class result {
      public static void main(String args[])
{
 Scanner SC= new Scanner(System.in);
 String a[][]=new String[5][8];
 int i,j,t;
 double per;
 for(i=0;i<5;i++)
 {
 j=0;
System.out.println("Enter Roll number");
a[i][j]=SC.next();
j++;
System.out.println("Enter name");
a[i][j]=SC.next();
j++;
System.out.println("Enter phy marks");
a[i][j]=SC.next();
j++;
System.out.println("Enter Che marks");
a[i][j]=SC.next();
j++;
System.out.println("Enter math marks");
a[i][j]=SC.next();
j++;
t=Integer.parseInt(a[i][2])+Integer.parseInt(a[i][3])+Integer.parseInt(a[i][4]);
a[i][j]=String.valueOf(t);
j++;
per=t/3;
a[i][j]=String.valueOf(per);
j++;
if(per>33)
a[i][j]="Pass";
else
a[i][j]="Fail";
}
System.out.println("Student report card");
for(i=0;i<5;i++)
{
for(j=0;j<8;j++)
{
 System.out.print(a[i][j]+"\t");
}
 System.out.println();
}
}
}
