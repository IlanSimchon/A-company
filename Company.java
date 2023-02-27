import java.util.ArrayList;
import java.util.PriorityQueue;

public class Company { // is the Sender of observer
    private Ceo ceo;
    private Data actualData; // Updated at the end of a year except for the profits which are updated at any given moment
    private ArrayList<Employee> employees;
    private ArrayList<Data> DataPerYear;
    private ArrayList<Product> products;
    private PriorityQueue<Client> clients;



    public Company(Ceo ceo , int costOfConstruction){
        this.ceo = ceo;
        this.actualData = new Data();
        this.actualData.setProfits(-costOfConstruction);
        this.employees = new ArrayList<>();
        this.DataPerYear  = new ArrayList<>();
        this.products = new ArrayList<>();
        this.clients = new PriorityQueue<>((Client a , Client b) -> a.getNumOfOrders().get(this) - b.getNumOfOrders().get(this));
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        this.employees.remove(employee);
    }

    public void addProduct(Product product){
        this.products.add(product);
        updateAll(product , 'a');
    }

    public void removeProduct(Product product){
        this.products.remove(product);
        updateAll(product , 'r');
    }

    public void addClient(Client client){
        for (Product product:products) {
            client.update(product , 'a');
        }
        this.clients.add(client);
    }

    public void removeClient(Client client){
        for (Product product:products) {
            client.update(product , 'r');
        }
        this.clients.remove(client);
    }

    public void newOreder(Client client , Product product){
        if(! product.isAlive()){
            System.out.printf("out of stock");
        }
        else {
            product.reduceAmount();
            actualData.setProfits(product.getPrice() - product.getCost());
            client.addOrder(this);
        }
    }

    public void updateAll(Product product , char addOrRemove){
        for (Client client:clients) {
            client.update(product , addOrRemove);
        }
    }



public void printStatistics(){
      int men = 0 , women = 0;
      double sumOfWages = 0 , seniority = 0 , age= 0;
      int numOfEmployees = employees.size();
    for (Employee employee: employees) {
        if(employee.getSex() == 'M')
            men++;
        else
            women++;
        sumOfWages += employee.getWages();
        seniority += employee.getSeniority();
        age += employee.getAge();
    }
    double precent = 100.0 / numOfEmployees;
    System.out.println("*** Statistics of employees ***");
    System.out.println("in our company there is a " + men*precent +"% of Men and " +women*precent +"% of women");
    System.out.println("the average of age of employees is " + age/numOfEmployees + " years old");
    System.out.println("the average of seniority of employees is " + seniority/numOfEmployees);
    System.out.println("the average wage is " + sumOfWages/numOfEmployees +" $");
}


}
