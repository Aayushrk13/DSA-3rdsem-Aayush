package LinkedList.Singly;

class StackusingLinkedlist {
    Linkedlist l=new Linkedlist();
    int top=0;
    public void push(int data){
        top++;
        l.insertAtLast(data);
    }
    public void print(){
        l.PrintList();
    }
    public void pop(){
        l.deleteAtBack();
        top--;
    }
    public void peek(){
        l.traversal(top);
    }
    
}
public class StackImplementationUsingSinglyLinkedlist{
    public static void main(String[] args) {
        StackusingLinkedlist sl=new StackusingLinkedlist();
        sl.push(5);
        sl.push(6);
        sl.push(7);
        sl.push(8);
        sl.push(9);
        sl.print();
        sl.pop();
        sl.peek();
    }
}
