
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputnumber;
    public int noOfguess;
    public int getnumberofguess(){
        return noOfguess;

    }
        public void getnumberofguess(int noOfguess){
            this.noOfguess = noOfguess;

        }
        Game(){
            Random rand = new Random();
            this.number = rand.nextInt(50);

        }
        void takeuserinput(){
            System.out.println("guess the number ");
            Scanner sc = new Scanner(System.in);
            inputnumber = sc.nextInt();
        }
        boolean iscorrectnumber(){
            noOfguess++;
            if (inputnumber==number) {
                System.out.format("yehhh you guess right, it was %d\n you guess it in %d attempts", number,noOfguess);
                return true;
            }
            else if(inputnumber<number){
                System.out.println("too low...");
            }
            else if(inputnumber>number){
                System.out.println("too high..");
            }
            return false;
        }

}

public class Guess_The_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b =false;
        while(!b){
            g.takeuserinput();
            b = g.iscorrectnumber();
            System.out.println(b);

        }
        
    }
}
