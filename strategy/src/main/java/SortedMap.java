import java.lang.reflect.Field;

/**
 * Created by user on 03-Mar-16.
 */

public class SortedMap<KeyType extends Comparable,ValueType extends Comparable> implements IMap<KeyType,ValueType>, ISortedMap<KeyType,ValueType>  {
    IElement<KeyType,ValueType> first, last;
    private int size;
    private MapComparator<IElement> mapComparator;
//    private IElement current, next;

    public SortedMap(MapComparator<IElement> mapComparator) {
        size = 0;
        this.mapComparator = mapComparator;
    }



    @Override
    public void sort() {

        boolean flag = true;
        while (flag){
            flag = compare(false);
        }
    }

    private boolean compare(boolean flag) {
        for (IElement current = first; current != last; current = current.getNext()) {
            IElement next = current.getNext();
            int comparison = mapComparator.compare(current, next);
            if (comparison > 0) {
                current = changePlaces(current, next);
                flag = true;
            }
        }
        return flag;
    }

private IElement changePlaces(IElement current, IElement next) {
    IElement previous, temp;
    IElement nextNext = null;
    if((previous = current.getPrevious()) != null) {
        previous.setNext(next);
        next.setPrevious(previous);
    }
    else {
        next.setPrevious(null);
    }
    if((nextNext = next.getNext()) != null) {
        nextNext.setPrevious(current);
    }
    temp = next.getNext();
    next.setNext(current);
    current.setPrevious(next);
    current.setNext(temp);
    if (current == first) {
        first = next;
    }
    if (next == last) {
        last = current;
    }
    return next;
}

@Override

public ValueType get(KeyType key) {
    for(IElement e = first; e!= null; e = e.getNext()) {
        if(e.getKey() == key) {
            return (ValueType) e.getValue();
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
    public void clear() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    @Override
    public IElement put(KeyType key, ValueType value) {
        IElement element = findElement(key);
        if(element != null) {
            element.setValue(value);
            sort();
            return element;
        }
        if (isEmpty()) {
            element = new Element(key, value);
            first = element;
        }
        else {
            element = new Element(key, value);
            element.setPrevious(last);
            last.setNext(element);
        }
        size++;
        last = element;
        sort();
        return element;
    }

    @Override
    public boolean remove(KeyType key) {
        if(isEmpty()) {
            return false;
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
        return true;
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
    @Override
    public int getSize() {
        return size;
    }
}

