import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 * Created by user on 03-Mar-16.
 */
public class Element<KeyType,ValueType> implements IElement<KeyType,ValueType>{
    KeyType key;
    ValueType value;
    IElement next;
    IElement previous;

    public Element() {
        this.key = null;
        this.value = null;
        this.previous = null;
        this.next = null;
    }
//    public Element(KeyType key, ValueType value, Element previous) {
//        this.key = key;
//        this.value = value;
//        this.previous = previous;
//        this.next = null;
//    }

    public Element(KeyType key, ValueType value, IElement previous) {
        this.key = key;
        this.value = value;
        this.previous = previous;
        this.next = null;
    }

    public IElement getNext() {
        return next;
    }

    public void setNext(IElement next) {
        this.next = next;
    }

    public IElement getPrevious() {
        return previous;
    }

    public void setPrevious(IElement previous) {
        this.previous = previous;
    }


    @Override
    public void create() {

    }

    @Override
    public KeyType getKey() {
        return key;
    }

    @Override
    public ValueType getValue() {
        return value;
    }

    @Override
    public boolean setKey(KeyType key) {
        this.key = key;
        return true;
    }

    @Override
    public boolean setValue(ValueType value) {
        this.value = value;
        return true;
    }

}
