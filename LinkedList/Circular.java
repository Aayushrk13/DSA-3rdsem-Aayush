package LinkedList;
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
    public void atlast(){
        Node temp=head;
        while (temp.nextaddress!=null) {
            temp=temp.nextaddress;
        }
        temp.nextaddress=head;
    }
    public void insertatfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.nextaddress=head;
            head=newNode;
        }
    }
    public void insertatlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while (temp.nextaddress!=null) {
                temp=temp.nextaddress;
            }
            temp.nextaddress=newNode;
        }   
    }
    public void insertatspecific(){

    }
    public void deleteatfirst(){

    }
    public void deleteatlast(){

    }
    public void deleteatspecificpos(){

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
    public static void main(String[] args) {
        Circularlinkedlist cl=new Circularlinkedlist();
        cl.insertatfirst(3);
        cl.insertatfirst(2);
        cl.insertatfirst(1);
        cl.atlast();
        cl.print();
    }
}