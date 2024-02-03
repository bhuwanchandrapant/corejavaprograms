

import java.util.*;


public class arraylistt {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(10);
        l2.add(10);

        l1.add(2);
        l1.add(1);
        l1.add(21);
        l1.add(26);
        l1.add(28);
        l1.add(0, 5);
        l1.add(2,6);
        l1.addAll(l2);
        System.out.println(l1.contains(39));
        System.out.println(l1.indexOf(4));
       
        //l1.clear();
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",  ");

        }

        
    }
}
