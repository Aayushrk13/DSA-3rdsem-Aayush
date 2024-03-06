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
            System.out.println(arr[i]);
        }
        for (int i = 0; i < right_array.length; i++) {
            right_array[i]=arr[mid_index+i];
            System.out.println(arr[i]);
        }
        //Merge arrays
        int resarray[]=new int [arr.length];

        int i=0;
        int j=0;
        int k=left_index;
        while(i<subarray1_size && j<subarray2_size)
        if(left_array[i]<right_array[j]){
            resarray[k++]=left_array[i++];
        }else{
            resarray[k++]=right_array[j++];
        }
        while(i<subarray1_size){
            resarray[k++]=left_array[i++];
        }
        while(j<subarray2_size){
            resarray[k++]=right_array[j++];
        }
    }
    void sort(int []arr,int left_index,int right_index){
        if(left_index<right_index){
            int mid_index=(left_index+right_index)/2;
            sort(arr, left_index, mid_index);
            //System.out.println(i++);
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
