

import java.util.*;


public class arraylistt {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(10);
        l2.add(10);

        l1.add(2);
        l1.add(211);
        l1.add(21);
        l1.add(26);
        l1.add(28);
        l1.add(0, 5);
        l1.add(2,6);
        l1.addAll(l2);
        for(int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));


        }

        
    }
}
