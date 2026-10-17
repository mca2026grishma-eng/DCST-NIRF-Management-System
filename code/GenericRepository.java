
import java.util.*;

/**
 * Generic repository for storing and managing objects.
 *
 * @param <T> type of objects stored in the repository
 */
public class GenericRepository<T> {

    /** List containing the repository items. */
    private List<T> items = new ArrayList<>();

    /**
     * Adds an item to the repository.
     *
     * @param item item to be added
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Displays all items stored in the repository.
     */
    public void display() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    /**
     * Returns the number of items in the repository.
     *
     * @return number of stored items
     */
    public int size() {
        return items.size();
    }

    /**
     * Displays any object passed to the method.
     *
     * @param <E> type of object
     * @param item object to display
     */
    public <E> void displayItem(E item) {
        System.out.println(item);
    }
}
