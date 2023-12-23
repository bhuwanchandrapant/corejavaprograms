import java.util.Scanner;
public class searchingArray {
    public static void main(String args[])
    {
    Scanner SC=new Scanner(System.in);
    int a[]=new int[5];
    int i,ser,p=0;
    for(i=0;i<5;i++)
    {
     System.out.println("Enter Array element");
    a[i]=SC.nextInt();
    }
      System.out.println("Array is   ");
      for(i=0;i<5;i++)
    {
     System.out.println(""+a[i]);
    }
    
    {
     System.out.println("Enter element to search");
    ser=SC.nextInt();
    for(i=0;i<5;i++)
    {
     if(a[i]==ser)
    p++;
    }
    if(p>0)
    System.out.println(ser +" Found" +p+"time");
    else
     System.out.println(ser +" Not Found");
    
    }
    }
    
}
