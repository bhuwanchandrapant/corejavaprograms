public class breakandcontinue {
    public static void main(String[] args) {
        //break and continue using loop
        /*for(int i=0; i<5;i++){
            System.out.println(i);
            System.out.println("java is great");
            if (i==3) {
                System.out.println("ending the loop");
                break;
                
            }

        }*/

      /*   int i =0;
        do{
            System.out.println(i);
            System.out.println("java is great");
            if (i==2) {
                System.out.println("loop end");
                break;
            }
            i++;
        } while(i<5);
        System.out.println("loop ends here");*/

for(int i=0;i<15;i++){
    if (i==5) {
        System.out.println("continue ka example");
        continue;
        
    }
    System.out.println(i);
    System.out.println("java is great");
}

    }
}
