package recursion;

public class TowerOfHanoi {
    public void toh(int n,char source,char aux,char destination){
        if(n==1){
            System.out.println("Moving disk 1 from "+ source +" to "+ destination);
            return;
        }
        toh(n-1, source, destination, aux);
        System.out.println("Moving disk"+n+" from "+ source +" to "+ destination);
        toh(n-1, aux, source, destination);
    }
    public static void main(String[] args) {
        TowerOfHanoi t=new TowerOfHanoi();
        t.toh(3, 'A', 'B', 'C');
    }
}
