

import java.util.Scanner;
public class evenoddtable {
    //program of table of any number



    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("please");
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

