import java.lang.reflect.Array;

public class practiceSet6 {
    public static void main(String[] args) {
        //practice question1
        /*float marks [] = {34.5f,56.7f,78.9f,98.5f,50.0f};
        float sum =0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is  " + sum);   */
                 
         ///practice question2

       /*  float marks [] = {34.44f,84.8f,73.9f,40.4f,89.2f};
        float num = 84.89f;
        boolean isInArray = false;

        for(float element:marks){
            if (num==element) {
                isInArray = true;
                break; 
            }
            }
            if (isInArray) {
            System.out.println("the value is present in the array");
                
            }
            else{
                System.out.println("the value is not present in the array"); 
            }*/



             //practice question3

             /*int marks [] = {56,67,78,89,90};
             int avg =0;
             for(int element:marks){
                avg = avg + element;

             }
            System.out.println("the avg of marks is  "+ avg/marks.length); */
            


              //practice question4
              /*int [][] mat1 = {{1,2,3}, {4,5,6}};

             int [][] mat2 = {{2,6,13},{3,7,1}};

              int [][] result = {{0,0,0},{0,0,0}};
              for(int i=0;i<mat1.length;i++){
                for(int j=0;j<mat1[i].length;j++){
                    System.out.format("setting value for i=%d and  j=%d\n",i,j);
                     result[i][j] = mat1[i][j] + mat2[i][j];
                }
              }
                  //printing the element of 2-D array
                  for(int i=0;i<mat1.length;i++){ //row number of times
                for(int j=0;j<mat1[i].length;j++){  // colimn number of times
                    System.out.print(result[i][j] + "  ");
                     result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println("");
                
              }*/



               // practice question5

              /*  int [] arr = { 1,2,3,4,5,6};
               int l = arr.length;
               int n = Math.floorDiv(l, 2);
               int temp;
               for(int i =0; i<n; i++){
                temp = arr[i];
                arr[i] = arr[l-i-1];
                arr[l-i-1] = temp;
               }
            for(int element:arr){
                System.out.print(element + "");
            }*/


            ///practice questiobn 6
            /*int [] arr = { 100,2,398,4,5,60};
            int max = 0;
            for (int element:arr){
                if (element>max) {
                    max = element;
                    
                }
            }
            System.out.println("the value of maximum array is " + max);*/


            //practice question 7
           /*  int [] arr = { 16,2,37,4,57,60};
            int min = Integer.MAX_VALUE;
            for(int element:arr){
                if (element<min) {
                    min = element;
                    
                }
            }
            System.out.println("the value of minimum array is " + min);*/


            ///practice question 8


            boolean isSorted = true;
            int [] arr = { 1,2,3,4,5,60};
            for(int i =0;i<arr.length-1;i++){
                if (arr[i] > arr[i+1]) {
                    isSorted = false;
                    break;
                    
                }
            }
            if (isSorted) {
                System.out.println("the array is sorted");
            }
            else{
                System.out.println("the array is not sorted");
            }
        

        

    }
}
