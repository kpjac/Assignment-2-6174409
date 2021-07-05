/**
 * Used to track clients walking into a business.
 *
 * <p>Usually, the client that walks in first is the first client to be served.</p>
 */

import java.util.ArrayList;

public class ClientService implements ICollection {

    private ArrayList<Client> clients;
    private int cap;

    /**
     * Constructor setting client service capacity to passed value.
     *
     * <p>Throws exception if a negative value or zero is passed.</p>
     *
     * @param cap the capacity of the client service
     */
    public ClientService(int cap) {
        if (cap <= 0) {
            throw new IllegalArgumentException("Capacity cannot be a negative number or zero.");
        } else {
            clients = new ArrayList<Client>();
            this.cap = cap;
        }
    }

    /**
     * Default constructor sets capacity to 1.
     *
     */
    public ClientService() {
        clients = new ArrayList<Client>();
        this.cap = 1;
    }

    public int getCap() {
        return cap;
    }

    /**
     * Setter for capacity throws same exception as constructor.
     *
     * <p>If capacity is lowered, any clients already in line for service but
     * over new capacity will still be served.</p>
     *
     * @param cap the capacity of the client service
     */
    public void setCap(int cap) {
        if (cap <= 0) {
            throw new IllegalArgumentException("Capacity cannot be a negative number or zero.");
        } else {
            this.cap = cap;
        }
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * Implementation of add(newItem) for client service.
     *
     * <p>The size of the queue must be under capacity.</p>
     *
     * @param newItem from signature of abstract method
     * @return true if a client is added, false if none is added
     */
    public boolean add(Object newItem) {
        if (newItem instanceof Client && clients.size() < cap) {
            Client clientToAdd = (Client) newItem;
            clients.add(clientToAdd);
            return true;
        } else
            return false;
    }

    /**
     * Implementation of getNext()
     *
     * <p>Removes the client at the front of the line (at the beginning of the clients ArrayList).</p>
     *
     * @return the next client
     */
    public Object getNext() {
        if (clients.size() > 0) {
            Client next = clients.get(0);
            clients.remove(0);
            return next.getName();
        } else
            return false;
    }

}
