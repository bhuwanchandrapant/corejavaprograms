import java.util.Scanner;

public class PracticeSet7forMETHODS {



static void multification(int n){       /////multification of table question1
    for(int i=1;i<=10;i++){
        System.out.format("%d X %d = %d\n",n, i, n*i);

    }
}
 static void pattern(int n){      //pattern question 2 
    for (int i=0;i<=n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(" * ");

        }
        System.out.println("");
    }
 }
  static int sumRec(int n){      // sum of n natural number question3
    //base condition
    if (n==1) {
        return 1;
        
    }
    return n + sumRec(n-1);

 }
 static int fib(int n ){   // question4 fibbonacci using recursion 
 if(n == 1) {
    return 0;
 } 
 else if (n == 2) {
    return 1;  
 }
 else{
     return fib(n-11) + fib(n-2);
 }

}
 static void pattern1_rec(int n){
     if (n > 0) {
        pattern1_rec(n-1);
        for(int i =0;i<n;i++){
            System.out.print("*");

        }
        System.out.println();
     }
    }




    public static void main(String[] args) {
        ////question1
    
        //multification(8);

        ////question2
       // pattern(4);

        ////practice question
       /*  Scanner s= new Scanner(System.in);
    System.out.println("please enter the number");
    int num = s.nextInt();
    for(int i=1;i<11;i++){
        System.out.print(num+"*"+i+"="+num*i);
        if(i%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        
    }*/

            /////question3

           // int c = sumRec(200);
           // System.out.println(c);


          ///question 4
          int result = fib(5);
          System.out.println(result);
               
          //////question 8
          pattern1_rec(5);
        
    }
}
