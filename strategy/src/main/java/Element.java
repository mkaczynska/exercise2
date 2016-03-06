/**
 *
 * Class used to implements Elements of hashMap
 */
public class Element<KeyType extends Comparable,ValueType extends Comparable> implements IElement<KeyType,ValueType> {

    private KeyType key;
    private ValueType value;
    private IElement nextElement;
    private IElement previousElement;

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
        nextElement = next;
    }

    /**
     *     /**
     * Method return next Element as children to Element.
     * @return child of element.
     */
    public IElement getNext() {
        return nextElement;
    }

    @Override
    public void setPrevious(IElement previous) {
        previousElement = previous;
    }

    @Override
    public IElement getPrevious() {
        return previousElement;
    }

//    public final Comparator<IElement<KeyType,ValueType>> KEY_COMPARATOR = new Comparator<IElement<KeyType,ValueType>>() {
//        @Override
//        public int compare(IElement<KeyType, ValueType> o1, IElement<KeyType, ValueType> o2) {
//            return o1.getKey().compareTo(o2.getKey());
//        }
//    };

}