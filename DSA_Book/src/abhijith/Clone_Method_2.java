package abhijith;

public class Clone_Method_2 implements Cloneable{
    String name;
    int age;

    public static void main(String[] args) {
        Clone_Method_2 cm1=new Clone_Method_2();
        cm1.name="Kushal";
        cm1.age=20;
        System.out.println(cm1.name);
        System.out.println(cm1.age);
        System.out.println(cm1);
        try {
            Clone_Method_2 cm2= (Clone_Method_2) cm1.clone();
            System.out.println(cm2.name);
            System.out.println(cm2.age);
            System.out.println(cm2);
            cm1.name="Kiran";
            cm1.age=25;
            System.out.println(cm1.name);
            System.out.println(cm1.age);
            System.out.println(cm2.name);
            System.out.println(cm2.age);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
