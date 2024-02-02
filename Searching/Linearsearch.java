import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter size of array:");
        int size=scan.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the data");
        for (int i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the data to search:");
        int key =scan.nextInt();
        boolean flag=false;
        for (int i:arr) {
            if(i==key){
                System.out.println("The data is in the array");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("The data is not in array.");
        }
    }
}
