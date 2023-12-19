public class MethodOverloading {

static void change(int a){
    a =98;

}
static void change2(int [] arr){
    arr[0] =998;

}

    static void telljoke(){
        System.out.println("i invented a new world!\n" + "plagiarism");
    }
     public static void main(String[] args) {
        
       /*  telljoke();

        ///changing the integer
        int x =45;
        change(x);
        System.out.println("the value of x after the changing is " + x);*/

          ///changing the array
          int [] marks = {52,73,77,89,98,94};
          change2(marks);
          System.out.println("the value of x after the changing is " + marks[0]);

     }


}
