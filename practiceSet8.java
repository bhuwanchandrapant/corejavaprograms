
///question1
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;

    }
    public void setName(String n){
        name = n;

    }
}
class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }
}
/////////////////////////////////////////////////////////////
   //question2
class cellPhone{
    public void ring(){
        System.out.println("ringing......");

    }
    public void vibrate(){
        System.out.println("vibrating");
    }
    public void callFriend(){
        System.out.println("calling bhuwan.......");
    }
}
class tommy{
    public void  hit(){
        System.out.println("hitting the enemy...");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing at the enemy");
    }
}

public class practiceSet8 {
    public static void main(String[] args) {
        //question 1
        Employee bhuwan = new Employee();
        bhuwan.setName("bhuwan chandra pant");
        bhuwan.salary = 123456;
        System.out.println(bhuwan.getSalary());
        System.out.println(bhuwan.getName()) ;


        //question 2
        cellPhone asus = new cellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        //question 3
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //question5
        tommy player = new tommy();
        player.hit();
        player.run();
        player.fire();


    }
    
}