/**
 *
 * Created by user on 03.03.2016.
 */
public interface IElement<KeyType,ValueType> {

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
    public boolean setValue(ValueType value);

    public void setNext(IElement next);
    public IElement getNext();
    

}