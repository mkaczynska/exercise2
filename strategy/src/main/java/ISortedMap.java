/**
 * Created by user on 03-Mar-16.
 */
public interface ISortedMap<KeyType,ValueType> extends IMap<KeyType,ValueType> {
    public enum Order {
        ASC,DESC
    }
    public abstract ISortedMap sortByKey(Order order);
    public abstract ISortedMap sortByValue(Order order);
}
