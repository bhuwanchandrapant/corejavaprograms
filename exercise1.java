import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sub1");
        float a = sc.nextInt();
        System.out.println("enter sub2");
        float b = sc.nextInt();
        System.out.println("enter sub3");
        float c = sc.nextInt();
        System.out.println("enter sub4");
        float d = sc.nextInt();
        System.out.println("enter sub5");
        float e= sc.nextInt();
        float t = a+b+c+d+e;
        float p = t*100/500;
        System.out.println("total marks  is" + t);
        System.out.println("percentage is" + p);
        
        



    }
    
}
