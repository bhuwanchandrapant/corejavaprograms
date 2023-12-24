
class myemploye{
    private int id;
    private String name;
    public myemploye(){
        id = 0;
        name = "your-name-here";

    }
    public myemploye(String myName, int myId){
        id = myId;
        name = myName;

    }
    public myemploye(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){return name;}
    public void setName(String n){this.name= n;}
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}


public class construtorOverloading {
    public static void main(String[] args) {
        myemploye bhuwan = new myemploye("bhuwanchandrapant", 12);
        System.out.println(bhuwan.getId());
        System.out.println(bhuwan.getName());

        
    }

}
