public class nested1 {
    public static void main(String args[])
    {
     int i,m,r,n;
    for(i=1;i<=200;i++)
    {
      n=i;
      r=0;
      while(n>0)
    {
     m=n%10;
    r=r+m*m*m;
    n=n/10;
    }
    if(r==i)
    
    System.out.println(i+"is armstrong");
    else
    System.out.println(i+"is not-armstromg");
    }
    }
}
