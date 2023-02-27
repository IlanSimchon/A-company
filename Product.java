public abstract  class Product {

    private Company company;
    private int price;
    private int cost;
    private int amount;



    public Company getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public int getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void reduceAmount(){
        this.amount--;
    }


    public boolean isAlive(){
        return this.amount > 0;
    }
}
