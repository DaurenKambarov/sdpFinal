import java.util.ArrayList;
import java.util.List;

public class ClientMenu implements Menu{
    Client client = new Client();

    public static List<Client> clients = new ArrayList<>();

    @Override
    public void buyProduct() {
        System.out.println("What do you want to buy?  (We have Iphone, MacBook Pro, Air Book)");
    }
    @Override
    public void sellProduct() {

    }

    @Override
    public boolean subscribe() {
        if (!clients.contains(client)) {
            clients.add(client);
            return true;
        }
        return false;
    }

    @Override
    public boolean unsubscribe() {
        if(clients.contains(client)){
            clients.remove(client);
            return true;
        }
        return false;
    }

    @Override
    public void notifySubscriber() {
    }

    @Override
    public void inBasket() {

    }
}
