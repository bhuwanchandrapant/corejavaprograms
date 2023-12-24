
class MyEmployee{
    int id;
    String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}

public class accessmodifAndConstructor {
    public static void main(String[] args) {
        MyEmployee bhuwan = new MyEmployee();
       /*  bhuwan.id = 123;
        bhuwan.name = "BhuwanChandraPant";*/ // throws error due to access modifier

        bhuwan.setName("bhuwanchandra pant");
        System.out.println(bhuwan.getName());
        bhuwan.setId(1234);
        System.out.println(bhuwan.getId());

    }
    
}
