/**
 * Created by user on 03-Mar-16.
 */
// ctrl + shift + t

public class HashMap<KeyType,ValueType>  implements IMap<KeyType,ValueType> {
    IElement first;
    IElement last;
    private int size;
    public HashMap() {
        size = 0;
    }

// Na podstawie klucza element hashCode
    @Override
    public void clear() {
        first = null;
        last = first;
        size = 0;
    }


    @Override
    public Object get(KeyType key) {
        for(IElement el = first; el!= null; el = el.getNext()) {
            if(el.getKey() == key) {
                return el.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if(size() == 0)
            return true;
        else
            return false;
    }

    @Override
    public IElement put(KeyType key, ValueType value) {
        IElement element = findElement(key);
        if(element != null) {
            element.setValue(value);
            return element;
        }
        if (isEmpty()) {
            element = new Element(key, value, null);
            first = element;
        }
        else {
            element = new Element(key, value, last);
            last.setNext(element);
        }
        size++;
        last = element;
        return element;
    }

    @Override
    public IElement remove(KeyType key) {
        if(isEmpty()) {
            return null;
        }
        IElement element = findElement(key);
        if(size() == 1) {
            first = null;
            last = null;
        }
        else if(element.getNext() == null) {
            element.getPrevious().setNext(null);
            last = element.getPrevious();
        }
        else {
            element.getPrevious().setNext(element.getNext());
            element.getNext().setPrevious(element.getPrevious());
        }
        size--;
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void show() {
        for (IElement el = first; el != null; el = el.getNext()) {
           System.out.println(el.getKey().toString() + ": " + el.getValue());
        }
    }

    @Override
    public IElement findElement(KeyType key) {
        for(IElement el = first; el!= null; el = el.getNext()) {
            if(el.getKey() == key) {
                return el;
            }
        }
        return null;
    }
}
