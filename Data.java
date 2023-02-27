public class Data {
    private int profits;
    private int numOfEmployees;
    private int numOfProducts;



    public Data(){

    }

    public int getProfits() {
        return profits;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setProfits(int profits) {
        this.profits += profits;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }
}
