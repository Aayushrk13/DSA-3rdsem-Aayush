public class StackImplmentationUsingArray{
    private int top;
    private int []array;
    int array_size=5;
    int value;
    public StackImplmentationUsingArray(){
        array=new int [array_size];
        this.top=-1;
    }
    public void push(int value){
        if(top>=array_size){
            System.out.println("The stack is full.");
        }else{
            top++;
            array[top]=value;
            System.out.println("The value is entered.");
        }
    }
    public void pop(){
        if(top<=-1){
            System.out.println("The stack is empty.");
        }else{
            top--;
        }
    }
    public void peek(){
        if(top<=-1){
            System.out.println("\nThe stack is empty.");
        }else{
            System.out.println("\n The element at the top is"+array[top]);
        }
    }
    public void display(){
        if (top<=-1) {
            System.out.println("The stack is empty.");
        }else{
            System.out.println("\nData in the stack is:");
            for(int i=0;i<=top;i++){
                System.out.print(array[i]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        StackImplmentationUsingArray s=new StackImplmentationUsingArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.display();
        s.peek();
    }
}