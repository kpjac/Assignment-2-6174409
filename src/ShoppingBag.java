/**
 * Used to track items in a shopping bag.
 *
 * When an item is placed in an empty bag, it is placed at the bottom
 * of the bag, then we place another item on top of it and so on until
 * the bag is full. When emptying a bag, we start with the item on top
 * then the next until the bag is empty.
 */

public class ShoppingBag implements ICollection{

    private BagItem[] items;
    private int numItems;

    /**
     * Parameterized constructor to give the correct size to the array instance
     * variable representing the shopping bag.
     *
     * @param bagSize
     */
    public ShoppingBag(int bagSize) {
        if (bagSize <= 0) {
            throw new IllegalArgumentException("Bag size cannot be a negative number or zero.");
        } else {
            items = new BagItem[bagSize];
            numItems = 0;
        }
    }

    /**
     * Default constructor featuring a default bag capacity of 20.
     */
    public ShoppingBag() {
        items = new BagItem[20];
        numItems = 0;
    }

    public BagItem[] getItems() {
        return items;
    }

    public int getNumItems() {
        return numItems;
    }

    /**
     * Implementation of add(newItem) for shopping bag.
     *
     * Checks if there is space in the bag and if the passed object is a
     * BagItem before adding.
     *
     * @param newItem
     * @return true if an item is added, false if none is
     */
    public boolean add(Object newItem) {
        if (numItems < items.length && newItem instanceof BagItem) {
            BagItem toAdd = (BagItem) newItem;
            items[numItems] = toAdd;
            numItems++;
            return true;
        } else
            return false;
    }

    /**
     * Implementation of getNext() for shopping bag.
     *
     * Removes the item from the "top" of the bag (the last element in the
     * items array).
     *
     * @return the next BagItem or false if the bag is empty
     */
    public Object getNext() {
        if (items.length > 0) {
            numItems--;
            BagItem next = items[numItems];
            items[numItems] = null;
            return next;
        } else
            return false;
    }

}
