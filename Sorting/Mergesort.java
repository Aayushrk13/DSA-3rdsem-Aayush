package Sorting;

public class Mergesort {
    int i=0;
    void merge(int []arr,int left_index,int right_index,int mid_index){
        int subarray1_size=mid_index-left_index+1;
        int subarray2_size=right_index-mid_index;

        int []left_array=new int[subarray1_size];
        int []right_array=new int [subarray2_size];
        System.out.println("Left Array");
        for (int i = 0; i < left_array.length; i++) {
            left_array[i]=arr[left_index+i];//[0]=1
            System.out.println(left_array[i]);
        }
        System.out.println("Right array");
        for (int i = 0; i < right_array.length; i++) {
            right_array[i]=arr[mid_index+i+1];
            System.out.println(right_array[i]);
        }
        //Merge arrays
        int resarray[]=new int [arr.length];

        int i=0;
        int j=0;
        int k=left_index;
        while(i<subarray1_size && j<subarray2_size)
        if(left_array[i]<right_array[j]){
            arr[k++]=left_array[i++];
        }else{
            arr[k++]=right_array[j++];
        }
        while(i<subarray1_size){
            arr[k++]=left_array[i++];
        }
        while(j<subarray2_size){
            arr[k++]=right_array[j++];
        }
        System.out.println("resarray");
        for (int k2 = 0; k2 < resarray.length; k2++) {
            resarray[k2]=arr[k2];
            System.out.println(resarray[k2]);
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
        int []arr={1,8,7,5,2,4,3,6,9};
        ob.mergesort(arr);
    }
}
