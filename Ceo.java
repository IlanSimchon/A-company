public class Ceo extends Employee{
    private Ceo ceo = null;

    private Ceo(Employee employee){
        super(employee);
    }
    public Ceo CreateCeo(Employee employee){ // singleton design pattern
        if(this.ceo == null){
            this.ceo = new Ceo(employee);
        }
            return ceo;
    }
}
