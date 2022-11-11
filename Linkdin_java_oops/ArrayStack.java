public class ArrayStack {
    int top =-1;
    int arr[]= new int[10];
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack();
        as.insert(5);
        as.insert(13);
        as.insert(52);
        as.insert(59);
        as.insert(65);
        System.out.println();
        as.display();
        System.out.println();
        as.delete();
        System.out.println();
        as.display();
        System.out.println();
        as.peak();
        System.out.println();
        as.display();
        System.out.println();
        as.size();


    }

    public void insert(int data){
        if(top >= arr.length-1){
            System.out.println("Stack is full");
        }
        else {
            top++;
            arr[top]=data;
        }
    }
    public void delete(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Deleted element "+arr[top]);
            top--;
        }
    }
    public void peak(){
        if(top==-1){
            System.out.println("There is no element in stack to peak");
        }
        else {
            System.out.println(arr[top]);
        }
    }
    public void size(){
        System.out.println(top+1);
    }
    public void display(){
        for (int i = 0; i < top+1; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
