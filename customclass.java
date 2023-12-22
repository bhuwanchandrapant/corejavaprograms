


class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }
}

public class customclass {

    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee bhuwan = new employee(); //instantiating a new employee object
        employee john = new employee();   ///instantiating a new employee object
             /////setting attributes
             bhuwan.id = 26;
             bhuwan.name ="bhuwanpant";
             john.id = 27;
             john.name = "john cena";

             //printing the attributes
             bhuwan.printdetails();
             john.printdetails();  
    }
    
}
