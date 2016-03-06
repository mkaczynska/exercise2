import java.util.Comparator;


/**
 * Created by user on 05-Mar-16.
 */
public class MapComparator<T extends IElement> implements Comparator<T> {


    SortField sortfield;
    SortOrder sortOrder;

    public MapComparator(SortField sortfield, SortOrder sortOrder) {
        this.sortfield = sortfield;
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(T e1, T e2) {
        int comparison = 0;
        if (e1 == null || e2 == null) {
            return 0;
        }
        switch(sortfield) {
            case KEY:
                comparison = e1.getKey().compareTo(e2.getKey());
                break;
            case VALUE:
                comparison = e1.getValue().compareTo(e2.getValue());
                break;
        }
        if (sortOrder == SortOrder.DESC) {
            return -comparison;
        }
        else {
            return comparison;
        }

    }
}


