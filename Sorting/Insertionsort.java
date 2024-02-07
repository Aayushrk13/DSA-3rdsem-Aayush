package Sorting;

public class Insertionsort {
    void sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                //arr[j]=key;
                j=j-1;
            }
            arr[j+1]=key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr={3,2,4,1,5};
        Insertionsort i=new Insertionsort();
        i.sort(arr);
    }
}
