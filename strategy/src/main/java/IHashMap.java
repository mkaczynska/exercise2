import java.util.Collection;
import java.util.Set;

/**
 * Created by user on 03-Mar-16.
 */
interface IHashMap<KeyType,ValueType> extends IMap {
    public abstract IElement clone();
    public abstract Collection values();
}
