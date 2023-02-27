public class Employee extends Person{
    private int degree; // The degree of importance is between 1 and 3 , just CEO is 0
    private int wages;
    private int seniority; // seniority by year


    public Employee(String name , int id , int age , char sex, int degree , int wages , int seniority){
        super(name , id , age , sex);
        this.degree = degree;
        this.wages = wages;
        this.seniority = seniority;
    }

    public Employee(Person person , int degree , int wages , int seniority){
        super(person);
        this.degree = degree;
        this.wages = wages;
        this.seniority = seniority;
    }
    public Employee(Employee other){
        super(other);
        this.degree = other.degree;
        this.wages = other.wages;
        this.seniority = other.seniority;

    }

    public int getDegree() {
        return degree;
    }

    public int getWages() {
        return wages;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public void setSeniority() {
        this.seniority++; // Every year seniority increases by 1
    }
}
