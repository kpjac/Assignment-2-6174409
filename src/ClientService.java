import java.util.ArrayList;

public class ClientService implements ICollection {

    private ArrayList<Client> clients;
    private int cap;

    public ClientService(int cap) {
        if (cap <= 0) {
            throw new IllegalArgumentException("Capacity cannot be a negative number or zero.");
        } else {
            clients = new ArrayList<Client>();
            this.cap = cap;
        }
    }

    public ClientService() {
        clients = new ArrayList<Client>();
        this.cap = 1;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public boolean add(Object newItem) {
        if (newItem instanceof Client && clients.size() < cap) {
            Client clientToAdd = (Client) newItem;
            clients.add(clientToAdd);
            return true;
        } else
            return false;
    }

    public Object getNext() {
        if (clients.size() > 0) {
            Client next = clients.get(0);
            clients.remove(0);
            return next.getName();
        } else
            return false;
    }

}
