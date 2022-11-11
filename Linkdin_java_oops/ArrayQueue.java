public class ArrayQueue {
    int first =-1,last=-1;
    int arr[] = new int[10];
    public static void main(String[] args) {

    }
    public void Insert(int data){
        if(first==-1&&last==-1){
            first++;
            last++;
            arr[0]=data;
        }
        else if (last<arr.length-1){
            last++;
            arr[last]=data;
        }
        else {
            System.out.println("queue is full");
        }
    }
    public void Delete(){
        if(first==-1){
            
        }
    }
}
