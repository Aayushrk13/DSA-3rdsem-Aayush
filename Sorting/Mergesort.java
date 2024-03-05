package Sorting;

public class Mergesort {
    int i=0;
    void merge(int []arr,int left_index,int right_index,int mid_index){
        int subarray1_size=mid_index-left_index+1;
        int subarray2_size=right_index-mid_index;

        int []left_array=new int[subarray1_size];
        int []right_array=new int [subarray2_size];

        for (int i = 0; i < left_array.length; i++) {
            left_array[i]=arr[i];
        }
        for (int i = 0; i < right_array.length; i++) {
            right_array[i]=arr[mid_index+i];
        }
        //Merge arrays
        
    }
    void sort(int []arr,int left_index,int right_index){
        if(left_index<right_index){
            int mid_index=(left_index+right_index)/2;
            sort(arr, left_index, mid_index);
            System.out.println(i++);
            sort(arr, mid_index+1, right_index);
            merge(arr, left_index, right_index, mid_index);
        }
    }
    void mergesort(int []arr){
        int left_index=0;
        int right_index=arr.length-1;
        sort(arr, left_index, right_index);
    }
    public static void main(String[] args) {
        Mergesort ob=new Mergesort();
        int []arr={1,2,5,4,3};
        ob.mergesort(arr);
    }
}
