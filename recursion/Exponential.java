package recursion;

public class Exponential {
    public int expo(int x,int y){
        if(y==0){
            return 1;
        }else{
            return x*expo(x, y-1);
        }
    }
    public static void main(String[] args) {
        Exponential e=new Exponential();
        System.out.println("Answer:"+e.expo(5, 2));
    }
}
