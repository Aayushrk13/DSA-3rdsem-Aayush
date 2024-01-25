package LinkedList;
import java.util.*;
class Node{
    int data;
    Node nextaddress;
    public Node(int data){
        this.data=data;
        this.nextaddress=null;
    }
}

class Linkedlist{
    Node head=null;
    public void insertAtFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.nextaddress=head;
            head=newNode;
        }
    }

    public void insertAtLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
        }else{
            while (temp.nextaddress!=null) {
                temp=temp.nextaddress;
            }
            temp.nextaddress=newNode;
        }
    }

    public void insertAtSpecificpos(int data,int pos){
        Node newNode=new Node(data);//newnode making
        Node temp=head;//temp ma head
        Node temp1;//newNode
        if(pos==1){
            insertAtFirst(data);
        }else{
            while (pos--!=0) {
                if(pos==1){
                    temp1=temp.nextaddress;
                    temp.nextaddress=newNode;
                    newNode.nextaddress=temp1;
                    break;
                }
                temp=temp.nextaddress;
            }
        }
    }

    public void deletion(){//at first
        Node temp=head.nextaddress;
        head=temp;
    }

    public void deleteAtBack(){
        Node temp=head;
        if(temp.nextaddress==null){
            deletion();
        }
        Node temp1=head;
        while (temp.nextaddress!=null) {
            temp1=temp;
            temp=temp.nextaddress;
        }
        temp1.nextaddress=null;
    }

    public void deleteAtSpecificpos(int pos){
        Node temp=head;
        Node temp1=head;
        Node temp2=head;
        if(pos==1){
            deletion();
        }else{
            while (pos--!=0) {
                if(pos==1){
                    temp1=temp.nextaddress;
                    temp2=temp1.nextaddress;
                    temp1=null;
                    temp.nextaddress=temp2;
                    break;
                }
                temp=temp.nextaddress;
            }
        }      
    }

    public void PrintList() { 
        Node temp=head;
        while (temp!= null) { 
            System.out.print(temp.data); 
            temp = temp.nextaddress; 
            System.out.print("\t"); 
        } 
        System.out.println(); 
    }

    public void traversal(int pos){
        Node temp=head;
        while (--pos!=0) {
            temp=temp.nextaddress;
        }
        System.out.println(temp.data);
    }
}
public class SinglyLinkedList{
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Linkedlist l=new Linkedlist();
        SinglyLinkedList d=new SinglyLinkedList();
        System.out.println("Singly Linked List:");
        int choice;
        do{
            System.out.println("Enter your choice:");
            System.out.println("1.Insert Node at first.");
            System.out.println("2.Insert Node at Last.");
            System.out.println("3.Insert Node at Specific position.");
            System.out.println("4.Delete Node at First.");
            System.out.println("5.Delete Node at Last.");
            System.out.println("6.Delete Node at specific position.");
            System.out.println("7.Print Linked list.");
            System.out.println("8.Print Node at specific position.");
            System.out.println("9.Exit.");
            choice=d.choiceinput();
            switch (choice) {
                case 1:
                    l.insertAtFirst(d.input());
                    break;
                case 2:
                    l.insertAtLast(d.input());
                    break;
                case 3:
                    l.insertAtSpecificpos(d.input(), d.inputPosition());
                    break;
                case 4:
                    l.deletion();
                    break;
                case 5:
                    l.deleteAtBack();
                    break;
                case 6:
                    l.deleteAtSpecificpos(d.inputPosition());
                    break;
                case 7:
                    l.PrintList();
                    break;
                case 8:
                    l.traversal(d.inputPosition());
                    break;
                case 9:
                    break;
            
                default:
                System.out.println("Invalid choice.");
                    break;
            }
        }while(choice!=9);
    }
    public int inputPosition(){
        System.out.println("Enter the position:");
        int position=scan.nextInt();
        return position;
    }
    public int input(){ //data
        System.out.println("Enter the data:");
        int data=scan.nextInt();
        return data;
    }
    public int choiceinput(){
        System.out.println("Enter your choice:");
        int choice=scan.nextInt();
        return choice;
    }
}