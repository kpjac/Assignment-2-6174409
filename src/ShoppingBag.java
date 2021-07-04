public class ShoppingBag implements ICollection{

    private BagItem[] items;
    private int numItems;

    public ShoppingBag(int bagSize) {
        if (bagSize <= 0) {
            throw new IllegalArgumentException("Bag size cannot be a negative number or zero.");
        } else {
            items = new BagItem[bagSize];
            numItems = 0;
        }
    }

    public ShoppingBag() {
        items = new BagItem[20];
        numItems = 0;
    }

    public boolean add(Object newItem) {
        if (numItems < items.length && newItem instanceof BagItem) {
            BagItem toAdd = (BagItem) newItem;
            items[numItems] = toAdd;
            numItems++;
            return true;
        } else
            return false;
    }

    public Object getNext() {
        if (items.length > 0) {
            numItems--;
            return items[numItems];
        } else
            return false;
    }

}
