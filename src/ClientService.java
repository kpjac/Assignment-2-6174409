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
}
