public class Testing_obj {
    static int b =10;
    int data=50;
//    Testing_obj (int data){
//        this.data=data;
//    }
    void update(int data){
        this.data=data+50;
    }


    public static void main(String[] args) {
        Testing_obj t1= new Testing_obj();
        t1.update(100);
        System.out.println(t1.data);
        System.out.println(b);
    }
}
