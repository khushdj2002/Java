public class ArrayQueue {
    int first =-1,last=-1;
    int arr[] = new int[10];
    public static void main(String[] args) {
        ArrayQueue aq= new ArrayQueue();
        aq.EnQueue(5);
        aq.EnQueue(15);
        aq.EnQueue(25);
        aq.EnQueue(35);
        aq.Display();
        aq.Peak();
     //   aq.DeQueue();
        aq.Display();
        aq.DeQueue();
        aq.EnQueue(15);
        aq.EnQueue(16);
        aq.EnQueue(18);
        aq.EnQueue(28);
        aq.EnQueue(39);
        aq.EnQueue(59);
        aq.EnQueue(91);
        aq.Display();
    }
    public void EnQueue(int data){
        if(first==-1&&last==-1){
            first++;
            last++;
            arr[last]=data;
        }
        else if (last<arr.length-1){
            last++;
            arr[last]=data;
        } else if (Math.abs(last - first) < arr.length - 1) {
            if(last== arr.length-1){
                last=0;
                arr[last]=data;
            }
            else {
                last++;
                arr[last]=data;
            }
        } else {
            System.out.println("queue is full");
        }
    }
    public void DeQueue(){
        if(first==-1){
            System.out.println("Nothing to Delete");
        }
        else if (first< arr.length-1){
            first++;
        }
        else{
            if(last==first){
                last=-1;
                first=-1;
            }
            else {
                first=0;
            }
        }
    }
    public void Peak(){
        if(first==-1){
            System.out.println("Nothing in the queue");
        }
        else {
            System.out.println(arr[first]);
        }
    }
    public void Display(){
        if(first==last){
            System.out.println("Nothing to display");
        }
        else {
            for (int i = first; i <=last ; i++) {
                System.out.print(arr[i]+",");
            }
            System.out.println();
        }
    }
}
