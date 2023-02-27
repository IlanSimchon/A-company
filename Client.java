import java.util.ArrayList;
import java.util.HashMap;

public class Client extends Person{ // is the Member of observer
    ArrayList<Product> products;
    private HashMap<Company , Integer> numOfOrders;

    public Client(String name , int id , int age , char sex){
        super(name , id , age , sex);
        products = new ArrayList<>();
        numOfOrders = new HashMap<>();
    }

    public Client(Person person){
        super(person);
        products = new ArrayList<>();
        numOfOrders = new HashMap<>();
    }
    public void update(Product product , char addOrRemove){
        if(addOrRemove == 'a'){
        this.products.add(product);
    }
        else {
            this.products.remove(product);
                }
    }

    public HashMap<Company, Integer> getNumOfOrders() {
        return numOfOrders;
    }

    public void addOrder(Company company){
        int temp = this.numOfOrders.get(company);
        this.numOfOrders.put(company , temp + 1);
    }

    public void order(Product product){
        if(! this.products.contains(product)){
            System.out.printf("register to company before you try order her products");
        }
        else {
            product.getCompany().newOreder(this , product);
        }
    }


}
