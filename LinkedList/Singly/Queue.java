package LinkedList.Singly;
<<<<<<< HEAD
class queueusinglinkedlist{
=======
import java.util.*;
public class Queue{
>>>>>>> 2a11dabeee2f67205d0241b55285553161cd3d5f
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
<<<<<<< HEAD
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
=======
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Queue q=new Queue();
        int choice=0;
        do{
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.exit.");
            System.out.println("Enter your choice:");
            choice =scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data:");
                    int data=scan.nextInt();
                    q.enqueue(data);
                break;
                case 2:
                    q.dequeue();
                break;
                case 3:
                    q.print();
                break;
                case 4:
                    System.out.println("Program exited");
                break;
                default:
                    System.out.println("Invalid choice");
                break;
            }
        }while(choice!=4);
    }
}
>>>>>>> 2a11dabeee2f67205d0241b55285553161cd3d5f
