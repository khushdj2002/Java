public class this_1 {
      String title="This is main class string";

    public static void main(String[] args) {
     //if static    System.out.println(title);
        this_1 t= new this_1();
        System.out.println(t.title);
        t.show();
        t.show1();
    }
    public void show(){
        String title = "This is show method stroing";
        System.out.println(title);
        System.out.println(this.title);
    }
    public void show1(){

        System.out.println(title);
    }
}
