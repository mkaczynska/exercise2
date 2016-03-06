/**
 *
 * Created by user on 03.03.2016.
 */
public interface IElement<KeyType extends Comparable, ValueType extends Comparable> {

    /**
     *  Method return key of element.
     * @return return key of element.
     */
    public KeyType getKey();

    /**
     * Method return value of element.
     * @return return value of element.
     */
    public ValueType getValue();

//    /**
//     *
//     * @param key
//     * @return
//     */
//    boolean setKey(KeyType key);

    /**
     * Method setValue to element.
     * @param value value of element;
     * @return return true if value was set;
     */
    boolean setValue(ValueType value);

    void setNext(IElement next);
    IElement getNext();

    void setPrevious(IElement next);
    IElement getPrevious();
    

}