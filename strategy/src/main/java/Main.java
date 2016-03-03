import java.util.*;

/**
 * Created by user on 03-Mar-16.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"first");
        hashMap.put(2,"second");
        hashMap.put(3,"third");
        hashMap.put(3,"fourth");
//        hashMap.remove(2);
//        hashMap.clear();
        System.out.println(hashMap.size());
        hashMap.show();

    }
}
