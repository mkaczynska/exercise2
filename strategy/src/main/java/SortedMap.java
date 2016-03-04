/**
 * Created by user on 03-Mar-16.
 */
import java.util.Collections;
import java.util.Comparator;
public class SortedMap<KeyType,ValueType> extends HashMap<KeyType,ValueType> implements ISortedMap<KeyType,ValueType>  {

    public SortedMap() {
    }



    @Override
    public ISortedMap sortByKey(Order order) {
        return null;
    }

    @Override
    public ISortedMap sortByValue(Order order) {
        return null;
    }

    private void switchElements(IElement e1, IElement e2, Order order) {

    }
}
