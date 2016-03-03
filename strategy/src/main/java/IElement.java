import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 * Created by user on 03-Mar-16.
 */
interface IElement<KeyType,ValueType> {
    public abstract void create();
    public abstract KeyType getKey();
    public abstract ValueType getValue();
    public abstract boolean setKey(KeyType key);
    public abstract boolean setValue(ValueType value);
    public abstract void setNext(IElement next);
    public abstract void setPrevious(IElement next);
    public abstract IElement getNext();
    public abstract IElement getPrevious();

}
