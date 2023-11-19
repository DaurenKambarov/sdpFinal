import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SellerMenu implements Menu{
    public static List<Client> clients = new ArrayList<>();
    @Override
    public void sellProduct() {
        System.out.println("What you want to sell ?");
        Scanner scam = new Scanner(System.in);
        String nameOfProd = scam.nextLine();
        if(nameOfProd.equals("Iphone") || nameOfProd.equals("AirBook")){
            System.out.println("How much it will cost? ");
            int costOfProd = scam.nextInt();
            System.out.println("Nice! Your product have inserted in market! ");
        }
        else{
            System.out.println("We can not apply this product! ");
        }
    }

    @Override
    public void buyProduct() {

    }

    @Override
    public boolean subscribe() {
        return false;
    }

    public void removeObserver(Client client){
        clients.remove(client);
    }
    @Override
    public boolean unsubscribe() {
        return false;
    }

    @Override
    public void notifySubscriber() {
        System.out.println("Do you want to notify your clients about product? (Yes/No)");
        Scanner scan = new Scanner(System.in);
        String answerOfSeller = scan.nextLine();
        if(answerOfSeller.equals("yes") || answerOfSeller.equals("Yes") || answerOfSeller.equals("YES")){
            for (int i = 0; i < clients.size(); i++){
                System.out.println(clients.get(i).name + " " + clients.get(i).surname + " is notified");
            }
        }
        else {
            System.out.println("Ok, you can return whenever you want");
        }
    }

    @Override
    public void inBasket() {

    }


}
