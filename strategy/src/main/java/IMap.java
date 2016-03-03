import java.util.Set;

/**
 * Created by user on 03-Mar-16.
 */
public interface IMap<KeyType,ValueType> {
    public abstract void clear();
    public abstract Object get(KeyType key);
    public abstract boolean isEmpty();
    public abstract IElement put(KeyType key, ValueType value);
    public abstract IElement remove(KeyType key);
    public abstract int size();
    public abstract void show();
    public abstract IElement findElement(KeyType key);
}
