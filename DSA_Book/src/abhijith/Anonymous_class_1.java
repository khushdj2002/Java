public class Anonymous_class_1 {
    public static void main(String[] args) {
        Age oj1= new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is  "+x);
            }
        };
        oj1.getAge();
    }
}
interface Age{
    int x=19;
    void getAge();
}
//class MyClass implements Age{
//    @Override
//    public void getAge() {
//        System.out.println("Age is "+x);
//    }
//}
