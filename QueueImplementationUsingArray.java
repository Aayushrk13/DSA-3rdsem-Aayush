class Queue{
    private int arraysize;
    private int front;
    private int back;
    private int []array;
    public Queue(){
        arraysize=5;
        front=0;
        back=-1;
        array=new int [arraysize];
    }
    public boolean isEmpty(){
        return (front==0 && back==-1);
    }
    public boolean isFull(){
        return (back==arraysize-1);
    }

    public void insert(int value){
        if(!isFull()){
            array[++back]=value;
        }
    }
    public void delete(){
        if(!isEmpty()){
            for(int i=0;i<back;i++){
                array[i]=array[i+1];
            }
            back--;
        }
    }
    public void display(){
        if(!isEmpty()){
            System.out.println("The elements in the Queue are:");
            for(int i=front;i<=back;i++){
                System.out.print(array[i]+"\t");
            }
            System.out.println("\n");
        }
    }

}
public class QueueImplementationUsingArray {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.insert(0);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display();
        q.delete();
        q.delete();
        q.display();
    }
}
