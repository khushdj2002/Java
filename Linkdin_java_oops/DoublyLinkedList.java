public class DoublyLinkedList {
    private DoubleNode head;

    public void insertAtHead(int data){
       DoubleNode newNode = new DoubleNode(data);
       newNode.setNextNode(this.head);
       if (this.head!=null) {
           this.head.setPrevNode(newNode);
       }
       this.head=newNode;
    }
    public void deleteFromHead(){
        this.head=this.head.getNextNode();
    }
    public DoubleNode Search(int data){
        DoubleNode current = this.head;

        while (current!=null){
            if(current.getData()==data){
                return current;
            }
            current=current.getNextNode();
        }
        return null;
    }

    public DoubleNode InsertionSort(int data){
        return null;
    }

    public DoubleNode InsertSortedData(int data){
        DoubleNode newNode = new DoubleNode(data);
        DoubleNode current =this.head;
       while (current.getNextNode()!=null){
           if(current.getNextNode().getData()>data){
               newNode.setNextNode(current.getNextNode());
               current.setNextNode(newNode);

           }
           current=current.getNextNode();
       }
        return null;
    }

    public String toString(){
        String result="{";
        DoubleNode current =  this.head;
        while (current!=null){
            result=result+current.toString()+", ";
            current=current.getNextNode();
        }
        result=result+"}";
        return result;
    }
}