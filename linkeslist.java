
import java.util.LinkedList;

public class linkeslist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new  LinkedList<>();
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
        l1.addLast(111);
        l1.addFirst(111);
        System.out.println(l1.contains(39));
        System.out.println(l1.indexOf(4));
       
        //l1.clear();
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",  ");

        }
    }
}
