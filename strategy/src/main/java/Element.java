/**
 *
 * Class used to implements Elements of hashMap
 */
public class Element<KeyType,ValueType> implements IElement<KeyType,ValueType> {

    private KeyType key;
    private ValueType value;
    private IElement nextElement;

    public Element(KeyType key,ValueType value)
    {
        this.key = key;
        this.value = value;
        this.nextElement = null;
    }

    /**
     * Method returning key of element
     * @return Returning Key of element.
     */
    @Override
    public KeyType getKey() {
        return this.key;
    }

    /**
     * Method return value of element.
     * @return return value of element.
     */
    @Override
    public ValueType getValue() {
        return this.value;
    }

    @Override
    /**
     * Method setValue to element.
     * @param value value of element;
     * @return return true if value was set;
     */
    public boolean setValue(ValueType value) {
        this.value = value;
        return true;
    }

    /**
     * Method set next Element as children to Element.
     * @param next Reference to next element;
     */
    public void setNext(IElement next)
    {
        this.nextElement = next;
    }

    /**
     *     /**
     * Method return next Element as children to Element.
     * @return child of element.
     */
    public IElement getNext(){return this.nextElement;}

//    public final Comparator<IElement<KeyType,ValueType>> KEY_COMPARATOR = new Comparator<IElement<KeyType,ValueType>>() {
//        @Override
//        public int compare(IElement<KeyType, ValueType> o1, IElement<KeyType, ValueType> o2) {
//            return o1.getKey().compareTo(o2.getKey());
//        }
//    };

}