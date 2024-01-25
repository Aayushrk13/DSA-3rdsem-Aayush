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
        System.out.println(temp.nextaddress);
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
            System.out.println(head);
        }   
    }
    public void insertatspecific(int data, int pos){
        Node newNode=new Node(data);
        Node temp1=head;
        if(pos==1){
            insertatfirst(data);
        }else{
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
          //asdasd merge with main
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
        cl.insertatlast(4);
        cl.atlast();
        cl.insertatspecific(5, 4);
        cl.print();
    }
}