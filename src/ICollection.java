/**
 * Provides abstract methods for adding items to collections and getting
 * next items in collection.
 */

public interface ICollection {

    public boolean add(Object newItem);

    public Object getNext();
}
