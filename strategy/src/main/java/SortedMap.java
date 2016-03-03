/**
 * Created by user on 03-Mar-16.
 */
public class SortedMap<KeyType,ValueType> extends HashMap<KeyType,ValueType> implements ISortedMap<KeyType,ValueType>  {

    @Override
    public ISortedMap sortByKey(Order order) {
        return null;
    }

    @Override
    public ISortedMap sortByValue(Order order) {
        return null;
    }

    private void switchElements(IElement e1, IElement e2, Order order) {
//        if(order == Order.ASC) {
//            if (e1.getKey() e2.getKey()) {
//
//            }
//        }

    }
}
