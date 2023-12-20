import java.util.Scanner;

public class PracticeSet7forMETHODS {



static void multification(int n){       /////question1
    for(int i=1;i<=10;i++){
        System.out.format("%d X %d = %d\n",n, i, n*i);

    }
}
 static void pattern(int n){      //question 2
    for (int i=0;i<=n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(" * ");

        }
        System.out.println("");
    }
 }



    public static void main(String[] args) {
        ////question1
    
        multification(8);

        ////question2
        pattern(4);

        ////practice question
        Scanner s= new Scanner(System.in);
    System.out.println("please enter the number");
    int num = s.nextInt();
    for(int i=1;i<11;i++){
        System.out.print(num+"*"+i+"="+num*i);
        if(i%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        
    }
        
        
    }
}
