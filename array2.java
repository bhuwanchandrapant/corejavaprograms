public class array2 {
    public static void main(String[] args) {
        /*int [] marks = {12,34,56,78,90};
        System.out.println(marks.length);
        System.out.println(marks[3]);

        float[] number = {12.3f,23.5f,56.7f,78.9f};
        System.out.println(number.length);
        System.out.println(number[3]);


        String[] name = {"bhuwan","chandra","pant"};
        System.out.println(name.length);
        System.out.println(name[2]);  */


          //displaying the array (for loop)

          System.out.println("for loop example");
          int [] marks = {23,44,55,66,77};

          for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
          }

           // quick quig---displaying the array(for loop) in reverse
           System.out.println("in reverse order");
           for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
           }

         //////displaying the array ( for-each loop)
         System.out.println("for-each loop example");
         for (int element: marks){
            System.out.println(element);
         }


    }
  }
