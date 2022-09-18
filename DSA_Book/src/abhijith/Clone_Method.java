public class Clone_Method  implements Cloneable{
    String name;
    int age;

    public static void main(String[] args) {
        Clone_Method cm = new Clone_Method();
        cm.name="Kushal";
        cm.age=20;
        System.out.println(cm.name);
        System.out.println(cm.age);
        try {
            Clone_Method cm2 =(Clone_Method)cm.clone();
            System.out.println(cm2.name);
            System.out.println(cm2.age);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
