public class Product {
    Product(String Name, int Cost){
        getProp(Name, Cost);
    }
    private String name;
    private int cost;
    public void getProp(String Name, int Cost){
        name = Name;
        cost = Cost;
    }
}
