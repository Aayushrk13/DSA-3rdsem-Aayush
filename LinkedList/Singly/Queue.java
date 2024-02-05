package LinkedList.Singly;
class queueusinglinkedlist{
    Linkedlist l=new Linkedlist();
    public void enqueue(int data){
        l.insertAtLast(data);
    }
    public void dequeue(){
        l.deletion();
    }
    public void print(){
        l.PrintList();
    }
    public void atfront(){
        l.traversal(1);
    }
}
public class Queue {
    public static void main(String[] args) {
        queueusinglinkedlist q=new queueusinglinkedlist();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.print();
        q.dequeue();
        q.print();
        q.atfront();
    }
}
