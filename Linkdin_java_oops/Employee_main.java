public class Employee_main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kushal",25,50000,"CKM");
        Employee e2 = new Employee("Kiran",35,100000,"CKM");

        e2.raiseSalary();

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());

    }
}
