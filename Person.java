public class Person {
    private String name;
    private final int id;
    private int age;
    private final char sex;

    public Person(String name , int id , int age , char sex){
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    public Person(Person other){
        this.name = other.name;
        this.id = other.id;
        this.age = other.age;
        this.sex = other.sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(){
        this.age++;
    }

}
