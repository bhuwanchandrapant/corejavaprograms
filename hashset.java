import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myhashset = new HashSet<>(8, 0.5f);
        myhashset.add(12);
        myhashset.add(2);
        myhashset.add(22);
        myhashset.add(12);
        myhashset.add(12);
        myhashset.add(12);



        System.out.println(myhashset);

        
    }
}
