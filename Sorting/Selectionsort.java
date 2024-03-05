package Sorting;

public class Selectionsort {
    void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int small_index=i;
            int small=0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[small_index]>arr[j]){
                    small_index=j;
                }
                small=arr[small_index];
            }
            arr[small_index]=arr[i];
            arr[i]=small;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Selectionsort s=new Selectionsort();
        int []arr={3,1,2,4,5};
        s.sort(arr);
    }
}
