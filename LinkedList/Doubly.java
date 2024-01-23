package LinkedList;
class Node{
    int data;
    Node nextaddress;
    Node prevaddress;
    public Node(int data){
        this.data=data;
        this.nextaddress=null;
        this.prevaddress=null;
    }
}
class Doublylinkedlist{
    Node head=null;
    public void insertatfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.nextaddress=head;
            head.prevaddress=newNode;
            head=newNode;
        }
    }
    
    public void insertatlast(int data){
        Node temp=head;
        if(temp==null){
            insertatfirst(data);
        }else{
            Node newNode=new Node(data);
            while (temp.nextaddress!=null) {
                temp=temp.nextaddress;
            }
            temp.nextaddress=newNode;
            newNode.prevaddress=temp;
        }
    }
    public void insertatspecificpos(int data,int pos){
        Node temp=head;
        Node temp1;
        if(temp==null){
            insertatfirst(data);
        }else{
            while (pos--!=0) {
                if(pos==1){
                    Node newNode=new Node(data);
                    temp1=temp.nextaddress;
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
        Node temp=head;
        if(head==null){
            System.out.println("No linked list.");
        }
        temp=temp.nextaddress;
        head=temp;
        head.prevaddress=null;
    }
    public void deleteatlast(){
        if(head==null){
            System.out.println("No Linkedlist.");
        }else{
            Node temp=head;
            Node temp1;
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
        Node temp,temp1,temp2;//temp for delete
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
        temp=null;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.nextaddress;
        }
        System.out.println();
    }
    public void printback(){
        Node temp=head;
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
    public static void main(String[] args) {
        Doublylinkedlist dl=new Doublylinkedlist();
        dl.insertatfirst(3);
        dl.insertatfirst(2);
        dl.insertatfirst(1);
        dl.insertatlast(5);
        dl.insertatspecificpos(10, 2);
        dl.display();
        dl.deleteatspecific(6);
        dl.display();
    }
}
