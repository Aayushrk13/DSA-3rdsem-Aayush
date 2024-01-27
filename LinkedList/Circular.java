package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node nextaddress;
    public Node(int data){
        this.data=data;
        nextaddress=null;
    }
}
class Circularlinkedlist{
    Node head=null;
    public Node tempatlast(){
        Node temp=head;
        while (temp.nextaddress!=head) {
            temp=temp.nextaddress;
        }
        return temp;
    }
    public void insertatfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.nextaddress=head; 
        }else{
            newNode.nextaddress=head;
            Node temp=tempatlast();
            head=newNode;
            temp.nextaddress=head;
        }
    }
    public void insertatlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.nextaddress=head;
        }else{
            Node temp=tempatlast();
            temp.nextaddress=newNode;
            newNode.nextaddress=head;
        }   
    }
    public void insertatspecificpos(int data, int pos){
        Node newNode=new Node(data);
        if(pos==1){
            insertatfirst(data);
        }else{
            Node temp1=head;
            Node temp=head;
            while (--pos!=0) {
                if (pos==1) {
                    temp1=temp.nextaddress;
                    temp.nextaddress=newNode;
                    newNode.nextaddress=temp1;
                    break;
                }
                temp=temp.nextaddress;
            }
        }
    }
    public void deleteatfirst(){
        if(head.nextaddress==head){
            head=null;
            return;
        }
        Node temp=tempatlast();
        head=head.nextaddress;
        temp.nextaddress=head;
    }
    public void deleteatlast(){
        Node temp=head;
        Node temp1=head;
        while (temp.nextaddress!=head) {
            temp1=temp;
            temp=temp.nextaddress;
        }
        temp1.nextaddress=head;
        temp=null;
    }
    public void deleteatspecificpos(int pos){
        if (pos==1){
            deleteatfirst();
        }else{
            Node temp=head;
            Node temp1=head;
            while (--pos!=0) {
                temp1=temp;
                temp=temp.nextaddress;
            }
            temp1.nextaddress=temp.nextaddress;
            temp=null;
        }
    }
    public void print(){
        Node temp=head; 
        while (temp.nextaddress!=head) {
            System.out.println(temp.data);
            temp=temp.nextaddress;
        }
        System.out.println(temp.data);
    }
}
public class Circular{
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Circular Linked List");
        Circularlinkedlist cl=new Circularlinkedlist();
        Circular c=new Circular();
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
            System.out.println("8.Exit.");
            choice=c.choiceinput();
            switch (choice) {
                case 1:
                    cl.insertatfirst(c.inputdata());
                    break;
                case 2:
                    cl.insertatlast(c.inputdata());
                    break;
                case 3:
                    cl.insertatspecificpos(c.inputdata(), c.inputposition());
                    break;
                case 4:
                    cl.deleteatfirst();
                    break;
                case 5:
                    cl.deleteatlast();
                    break;
                case 6:
                    cl.deleteatspecificpos(c.inputposition());
                    break;
                case 7:
                    cl.print();
                    break;
                case 8:
                    break;
            
                default:
                System.out.println("Invalid choice.");
                    break;
            }
        }while(choice!=8);
   }
   public int inputdata(){
        System.out.println("Enter the data:");
        int data=scan.nextInt();
        return data;
   }
   public int choiceinput(){
    System.out.println("Enter your choice:");
    int choice=scan.nextInt();
    return choice;
   }
   public int inputposition(){
    System.out.println("Enter the position:");
    int pos=scan.nextInt();
    return pos;
   }
}