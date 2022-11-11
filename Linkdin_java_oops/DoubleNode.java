public class DoubleNode {
    private int data;

    private DoubleNode nextNode;
    private DoubleNode prevNode;

    public DoubleNode(int data){
        this.data=data;
    }

        public void setData(int data){
            this.data=data;
        }
        public int getData(){
            return this.data;
        }
        public DoubleNode getNextNode(){
            return nextNode;
        }
        public void setNextNode(DoubleNode nextNode){
            this.nextNode=nextNode;
        }
        public void setPrevNode(DoubleNode prevNode){
            this.prevNode=prevNode;
        }
        public  DoubleNode getPrevNode(){
            return prevNode;
        }
        public String toString(){
        return "data "+this.data;
        }
}

