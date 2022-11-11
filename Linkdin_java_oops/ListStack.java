import java.util.List;
import java.util.Stack;

public class ListStack {
    Stack<Integer> stack = new Stack<>();
    int top=-1;
    public static void main(String[] args) {
        ListStack ls = new ListStack();
        ls.Insert(10);
        ls.Insert(20);
        ls.Insert(30);
        ls.Insert(40);
        ls.Display();
        ls.Delete();
        ls.Display();
        ls.Peak();
        ls.Size();
    }
    public void Insert(int data){
        top++;
        stack.add(data);
    }
    public void Delete(){
        if(top==-1){
            System.out.println("Empty Stack");
        }else {
            stack.remove(top);
            top--;
        }
    }
    public void Display(){
        System.out.println(stack);
    }
    public void Peak(){
        if(top==-1){
            System.out.println("Empty Stack");
        }else {
            System.out.println(stack.peek());
           }
    }
    public void Size(){
        System.out.println(top+1);
    }
}
