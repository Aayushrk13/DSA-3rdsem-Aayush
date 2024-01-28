package LinkedList;

import java.util.Scanner;

class Node1{
    int data;
    Node1 nextaddress;
    Node1 prevaddress;
    public Node1(int data){
        this.data=data;
        this.nextaddress=null;
        this.prevaddress=null;
    }
}
class Doublylinkedlist{
    Node1 head=null;
    public void insertatfirst(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.nextaddress=head;
            head.prevaddress=newNode;
            head=newNode;
        }
    }
    
    public void insertatlast(int data){
        Node1 temp=head;
        if(temp==null){
            insertatfirst(data);
        }else{
            Node1 newNode=new Node1(data);
            while (temp.nextaddress!=null) {
                temp=temp.nextaddress;
            }
            temp.nextaddress=newNode;
            newNode.prevaddress=temp;
        }
    }
    public void insertatspecificpos(int data,int pos){
        Node1 temp=head;
        Node1 temp1;
        if(temp==null){
            insertatfirst(data);
        }else if (pos==1) {
            insertatfirst(data);
        }else{
            while (--pos!=0) {
                if(pos==1){
                    Node1 newNode=new Node1(data);
                    temp1=temp.nextaddress;
                    if(temp1==null){
                        insertatlast(data);
                        break;
                    }
                    newNode.prevaddress=temp;
                    temp.nextaddress=newNode;
                    temp1.prevaddress=newNode;
                    newNode.nextaddress=temp1;
                }
                temp=temp.nextaddress;
            }
        }
    }
    public void deleteatfirst(){
        Node1 temp=head;
        if(head==null){
            System.out.println("No linked list.");
            return;
        }
        temp=temp.nextaddress;
        head.nextaddress=null;
        head=temp;
        head.prevaddress=null;
    }
    public void deleteatlast(){
        if(head==null){
            System.out.println("No Linkedlist.");
        }else{
            Node1 temp=head;
            Node1 temp1;
            while(temp.nextaddress!=null){
                temp=temp.nextaddress;
            }
            temp1=temp.prevaddress;
            temp=null;
            temp1.nextaddress=null;
        }
    }
    public void deleteatspecific(int position){
        if(head==null){
            System.out.println("No Linkedlist.");
            return;
        }
        Node1 temp,temp1,temp2;//temp for delete
        temp=head;
        temp1=null;
        temp2=null;
        if(position==1){
            deleteatfirst();
        }
        while (--position!=0) {
            temp=temp.nextaddress;
            if(temp==null){
                System.out.println("Unreachable.");
                return;
            }
        }
        temp1=temp.prevaddress;
        temp2=temp.nextaddress;
        temp1.nextaddress=temp2;
        temp2.prevaddress=temp1;
        temp=null;

    }
    public void display(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.nextaddress;
        }
        System.out.println();
    }
    
    public void printback(){
        Node1 temp=head;
        while(temp.nextaddress!=null){
            temp=temp.nextaddress;
        }
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.prevaddress;
        }
    }
}

public class Doubly {
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Doublylinkedlist dl=new Doublylinkedlist();
        Doubly d=new Doubly();
        int choice=0;
        while (choice !=9) {
            System.out.println("Doubly Linkec list");
            System.out.println("1.Insert at first");
            System.out.println("2.Insert at Last.");
            System.out.println("3.Insert at specific position.");
            System.out.println("4.Delete at first.");
            System.out.println("5.Delete at last.");
            System.out.println("6.Delete at specific position.");
            System.out.println("7.Print the list from front.");
            System.out.println("8.Print the list from back.");
            System.out.println("9.Exit");
            choice=d.inputchoice();
            switch (choice) {
                case 1:
                    dl.insertatfirst(d.input());
                    break;
                
                case 2:
                    dl.insertatlast(d.input());
                break;
                case 3:
                    dl.insertatspecificpos(d.input(), d.position());
                break;
                case 4:
                    dl.deleteatfirst();
                break;
                case 5:
                    dl.deleteatlast();
                break;
                case 6:
                    dl.deleteatspecific(d.position());
                break;
                case 7:
                    dl.display();
                break;
                case 8:
                    dl.printback();
                break;
                case 9:
                break;
                default:
                System.out.println("Invalid choice.");
                    break;
            }
        }
    }
    int input(){
        System.out.println("Enter the data:");
        int data=scan.nextInt();
        return data;
    }
    int position(){
        System.out.println("Enter the position:");
        int pos=scan.nextInt();
        return pos;
    }
    int inputchoice(){
        System.out.println("Enter your choice:");
        int choice=scan.nextInt();
        return choice;
    }
}
