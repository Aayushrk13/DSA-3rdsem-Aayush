package LinkedList.Singly;
import java.util.*;
public class Queue{
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
