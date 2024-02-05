package LinkedList.Singly;

import java.util.Scanner;

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
        System.out.println("Data is deleted.");
    }
    public void peek(){
        l.traversal(top);
    }
    
}
public class StackImplementationUsingSinglyLinkedlist{
    public static void main(String[] args) {
        StackusingLinkedlist sl=new StackusingLinkedlist();
        Scanner scan=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("1.Push.");
            System.out.println("2.Pop.");
            System.out.println("3.Peek.");
            System.out.println("4.Print.");
            System.out.println("5.Exit");
            System.out.println("Enter your chocie:");
            choice=scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int data =scan.nextInt();
                    sl.push(data);
                    break;
                case 2:
                    sl.pop();
                break;
                case 3:
                    sl.peek();
                break;
                case 4:
                    sl.print();
                break;
                case 5:
                System.out.println("Program Exited.");
                break;
                default:
                System.out.println("Invalid choice!");
                    break;
            }
        }while(choice!=5);
        scan.close();
    }
}
