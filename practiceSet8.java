

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
/////////////////////////////////////////////////////////////
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

    }
    
}