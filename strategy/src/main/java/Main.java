import java.util.*;
import java.lang.String;


/**
 * Created by user on 03-Mar-16.
 */
public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(30,"fourth");
        hashMap.put(2,"second");
        hashMap.put(100,"first");
        hashMap.put(77,"third");
        hashMap.put(555,"tenth");
        hashMap.show();

        MapComparator mapComparator = new MapComparator(SortField.VALUE,SortOrder.DESC);
        ISortedMap<Integer,String> sortedMap = new SortedMap<Integer,String>(mapComparator);
        sortedMap.put(30,"fourth");
        sortedMap.put(2,"second");
        sortedMap.put(100,"first");
        sortedMap.put(77,"third");
        sortedMap.put(555,"tenth");
        sortedMap.show();
    }
}
