/**
 * Represents an individual shopping bag item.
 */

public class BagItem {
    private String name;
    private int upc;

    public BagItem(String name, int upc) {
        this.name = name;
        this.upc = upc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    @Override
    public String toString() {
        return name + " (" + upc + ")";
    }
}
