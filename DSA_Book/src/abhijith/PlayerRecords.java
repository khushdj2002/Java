package abhijith;

public class PlayerRecords {
    private String name;
    private int age;
    private int salary;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
